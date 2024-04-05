package org.nasdanika.models.java.util;

import java.util.Collection;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.models.coverage.Coverage;
import org.nasdanika.models.java.CompilationUnit;
import org.nasdanika.models.java.JavaFactory;
import org.nasdanika.models.java.Source;

import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ParserConfiguration.LanguageLevel;

public class JavaParserResourceFactory implements Resource.Factory {
	
	public static final LanguageLevel DEFAULT_LANGUAGE_LEVEL = LanguageLevel.JAVA_17;
	
	private ParserConfiguration parserConfiguration;
	private Function<Source,Collection<Coverage>> coverageProvider;
	
	public JavaParserResourceFactory() {
		this(DEFAULT_LANGUAGE_LEVEL, null);
	}

	public JavaParserResourceFactory(Function<Source,Collection<Coverage>> coverageProvider) {
		parserConfiguration = new ParserConfiguration();
		parserConfiguration.setLanguageLevel(DEFAULT_LANGUAGE_LEVEL);
		this.coverageProvider = coverageProvider;
	}
	
	public JavaParserResourceFactory(LanguageLevel languageLevel, Function<Source,Collection<Coverage>> coverageProvider) {
		parserConfiguration = new ParserConfiguration();
		parserConfiguration.setLanguageLevel(languageLevel);
		this.coverageProvider = coverageProvider;
	}
	
	public JavaParserResourceFactory(ParserConfiguration parserConfiguration) {
		this.parserConfiguration = parserConfiguration;
	}

	@Override
	public Resource createResource(URI uri) {
		return new JavaParserResource(uri, getParserConfiguration(), coverageProvider) {
			
			@Override
			protected CompilationUnit createCompilationUnit() {
				return JavaParserResourceFactory.this.createCompilationUnit(this);
			}
			
		};
	}
	
	/**
	 * Override to customize creation of a compilation unit
	 * @param resource
	 * @return
	 */
	protected org.nasdanika.models.java.CompilationUnit createCompilationUnit(JavaParserResource resource) {
		return JavaFactory.eINSTANCE.createCompilationUnit();
	}

	public ParserConfiguration getParserConfiguration() {
		return parserConfiguration;
	}

}
