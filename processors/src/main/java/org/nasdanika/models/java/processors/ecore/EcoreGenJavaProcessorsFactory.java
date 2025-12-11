package org.nasdanika.models.java.processors.ecore;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.java.JavaPackage;

@EPackageNodeProcessorFactory(nsURI = JavaPackage.eNS_URI)
public class EcoreGenJavaProcessorsFactory {

	private Context context;
	
	@Factory
	public final SourceProcessorFactory sourceProcessorFactory;	
	
	@Factory
	public final CompilationUnitProcessorFactory compilationUnitProcessorFactory;	
	
//	Annotation.java
//	AnnotationMember.java
//	Class.java
//	ClassInitializer.java
//	Code.java
//	Comment.java
//	Constructor.java
//	Enum.java
//	EnumConstant.java
//	Field.java
//	GenericType.java
//	Initializer.java
//	Interface.java
//	JavaFactory.java
//	JavaPackage.java
//	Member.java
//	Method.java
//	Module.java
//	NamedElement.java
//	Operation.java
//	Package.java
//	Parameter.java
//	Record.java
//	Type.java
//	TypedElement.java
	
	public EcoreGenJavaProcessorsFactory(Context context) {
		this.context = context;
		sourceProcessorFactory = new SourceProcessorFactory(context);
		compilationUnitProcessorFactory = new CompilationUnitProcessorFactory(context);
		
//		Annotation.java
//		AnnotationMember.java
//		Class.java
//		ClassInitializer.java
//		Code.java
//		Comment.java
//		Constructor.java
//		Enum.java
//		EnumConstant.java
//		Field.java
//		GenericType.java
//		Initializer.java
//		Interface.java
//		JavaFactory.java
//		JavaPackage.java
//		Member.java
//		Method.java
//		Module.java
//		NamedElement.java
//		Operation.java
//		Package.java
//		Parameter.java
//		Record.java
//		Type.java
//		TypedElement.java
	}
	

	@EPackageNodeProcessorFactory(
			label = "Java",
			description = "Java model for analysis and code generation",
			actionPrototype = """
            app-action:
              icon: https://img.icons8.com/color/48/java-coffee-cup-logo--v1.png
              content:
                content-markdown:
                  source:
                    content-resource:
                      location: java.md
			"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory, Object> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
