package org.nasdanika.models.java.util;

import java.util.Objects;
import java.util.function.Function;

import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.Util;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.coverage.ModuleCoverage;
import org.nasdanika.models.coverage.PackageCoverage;
import org.nasdanika.models.coverage.SourceFileCoverage;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.Source;

public class ModuleCoverageProvider implements Function<Source<?>, Coverage> {
	
	private ModuleCoverage coverage;

	public ModuleCoverageProvider(ModuleCoverage coverage) {
		this.coverage = coverage;
	}

	@Override
	public Coverage apply(Source<?> source) {
		if (source instanceof CompilationUnit) {
			CompilationUnit cu = (CompilationUnit) source;
			if (cu.eContainer() == null) {
				Resource cuResource = cu.eResource();
				if (cuResource == null) {
					throw new UnsupportedOperationException();					
				}
				String cuName = cuResource.getURI().lastSegment();
				String packageName = cu.getPackageName();
				if (!Util.isBlank(packageName)) {
					packageName = packageName.replace(".", "/");
				}
				for (PackageCoverage pkg: coverage.getPackages()) {
					if (Objects.equals(pkg.getName(), packageName)) {
						for (SourceFileCoverage sf: pkg.getSourceFiles()) {
							if (Objects.equals(cuName, sf.getName())) {
								return sf;
							}
						}
					}
				}
				return null;
			} else {
				throw new UnsupportedOperationException();
			}
		}
		
		return null;
	}

}
