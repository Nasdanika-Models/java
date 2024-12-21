package org.nasdanika.models.java.cli;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import org.apache.maven.model.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.cli.ProgressMonitorMixIn;
import org.nasdanika.common.Component;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.coverage.ModuleCoverage;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.util.GitLabURIHandler;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.util.JavaParserResourceFactory;
import org.nasdanika.models.java.util.ModuleCoverageProvider;
import org.nasdanika.ncore.Tree;
import org.nasdanika.ncore.TreeItem;

import picocli.CommandLine.Mixin;

/**
 * Base class for commands visiting sources. 
 */
public abstract class MavenVisitCommand extends MavenRetrospectCommand {

	protected MavenVisitCommand() {

	}

	protected MavenVisitCommand(CapabilityLoader capabilityLoader) {
		super(capabilityLoader);
	}
		
	@Mixin
	private ProgressMonitorMixIn progressMonitorMixin;		

	@Override
	protected <T> T apply(
			GitLabURIHandler gitLabURIHandler, 
			Date since, 
			Date until, 
			Project project, 
			URI baseURI,
			Model model) throws Exception {
	
		try (ProgressMonitor progressMonitor = progressMonitorMixin.createProgressMonitor(1)) {
			ResourceSet resourceSet = createResourceSet(gitLabURIHandler, progressMonitor);			
			Visitor<T> visitor = createVisitor(
					gitLabURIHandler, 
					since, 
					until, 
					project, 
					baseURI, 
					model, 
					resourceSet, 
					progressMonitor);
			visitor.start(progressMonitor);		
			
			visit(resourceSet, baseURI, null, visitor, progressMonitor);
	    	visitor.stop(progressMonitor);
	    	visitor.close(progressMonitor);
	    	
			
			System.out.println(model);
			// TODO Auto-generated method stub
			return visitor.getResult();
		}
	}

	protected ResourceSet createResourceSet(GitLabURIHandler gitLabURIHandler, ProgressMonitor progressMonitor) {
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		Map<String, Object> extensionFactoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();

		// Registering Java factory for loading java sources
		ModuleCoverage moduleCoverage = getModuleCoverage(progressMonitor);
		extensionFactoryMap.put(CompilationUnit.JAVA_EXTENSION, new JavaParserResourceFactory(moduleCoverage == null ? null : new ModuleCoverageProvider(moduleCoverage)));
		
		EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
		if (gitLabURIHandler != null) {
			uriHandlers.add(0, gitLabURIHandler);				
		}
		return resourceSet;
	}
	
	protected ModuleCoverage getModuleCoverage(ProgressMonitor progressMonitor) {
		return null;
	}	
	
	
	protected interface Visitor<T> extends Component {
		
		boolean shallVisit(URI uri, String path, ProgressMonitor progressMonitor);
		
		void visit(URI uri, String path, EObject obj, ProgressMonitor progressMonitor);
		
		T getResult();
		
		@Override
		default void start(ProgressMonitor progressMonitor) {
			
		}
		
		@Override
		default void stop(ProgressMonitor progressMonitor) {
			
		}
		
		@Override
		default void close(ProgressMonitor progressMonitor) {
			
		}
		
	}
	
	protected abstract <T> Visitor<T> createVisitor(
			GitLabURIHandler gitLabURIHandler, 
			Date since, 
			Date until, 
			Project project, 
			URI baseURI,
			Model model,
			ResourceSet resourceSet,
			ProgressMonitor progressMonitor);
	
	/**
	 * @param eObj
	 * @param baseURI Used to deresolve compilation unit URI's to includes/excludes
	 * @param outputURI
	 * @param openAIClient
	 * @throws IOException 
	 */
	protected <T> void visit(
			ResourceSet resourceSet,
			URI uri,
			String path,
			Visitor<T> visitor,
			ProgressMonitor progressMonitor) throws IOException {
		
		if (visitor.shallVisit(uri, path, progressMonitor)) {
	    	Resource resource = resourceSet.getResource(uri, true);
	    	for (EObject eObj: resource.getContents()) {
	    		visitor.visit(uri, path, eObj, progressMonitor);
				if (eObj instanceof Tree) {
					for (TreeItem treeItem: ((Tree) eObj).getTreeItems()) {
						URI itemURI = URI.createURI(treeItem.getName()).resolve(eObj.eResource().getURI().appendSegment(""));	
						if (treeItem instanceof Tree) {
							itemURI = itemURI.appendSegment("");
						}
						String itemPath = path == null ? treeItem.getName() : path + "/" + treeItem.getName();
			    		visit(resourceSet, itemURI, itemPath, visitor, progressMonitor);
					}
				}
	    	}
		}
	}

}
