Nasdanika Java model can be used for analysis and code generation.
It can be loaded from source files, class files and jar files.
Model elements can reference [coverage](https://coverage.models.nasdanika.org/) results.

Model elements can be referenced from other models.
For example, [Maven](https://maven.models.nasdanika.org/) project may reference a [Java Module](references/eClassifiers/Module/index.html).

File/resource top-level model elements, such as compilation units for ``*.java`` files and types for ``*.class`` files,
are loaded as [resources](https://javadoc.io/static/org.eclipse.emf/org.eclipse.emf.ecore/2.33.0/org/eclipse/emf/ecore/resource/Resource.html). 
It allows to use custom [URI handlers](https://javadoc.io/static/org.eclipse.emf/org.eclipse.emf.ecore/2.33.0/org/eclipse/emf/ecore/resource/URIHandler.html) to load resources from different sources. 
For example, [GitLabURIHandler](https://javadoc.io/static/org.nasdanika.models.gitlab/model/2024.3.0/org.nasdanika.models.gitlab/org/nasdanika/models/gitlab/util/GitLabURIHandler.html) can be used to load sources from GitLab repositories using REST API, without cloning, and commit modifications to GitLab.
Logical URI's, e.g. ``java://classes/org/nasdanika/common/Util`` may be used to reference model elements. 
Such logical URI's would be resolved to physical URI's, which may be different in different contexts - java sources or class files. 

Java model elements may be extended (subclassed) and subclasses can be loaded instead of the base classes.
In the above example of a Maven project referencing a Java module, instead of a reference there might be
a class, say ``MavenJar``, extending both Maven project and Java module. 
Another example might be a ``JavaTextRepositoryFile`` extending both [GitLab](https://gitlab.models.nasdanika.org/index.html) [TextRepositoryFile](https://gitlab.models.nasdanika.org/references/eClassifiers/TextRepositoryFile/index.html) and [CompilationUnit](https://java.models.nasdanika.org/references/eClassifiers/CompilationUnit/index.html).

Yet another example, which might be combined with the above examples, is a class extending Maven project, Java module, and [Architecture element](https://architecture.models.nasdanika.org/references/eClassifiers/ArchitectureElement/index.html)

This model is coarse-grained - it provides classes representing high-level "externally referenceable" constructs of the [Java language](https://docs.oracle.com/javase/specs/jls/se22/html/index.html).
Low-level constructs such as statements and expressions are not modeled.

Also, the model is somewhat loose on purpose to simplify code generation.
For example, a [source](references/eClassifiers/Source/index.html) child can be added to any subclass of Source
and source can be set to any text.

"[All models are wrong, but some are useful]".
By omitting low-level details this model is wrong to be useful for its intended purpose - high level analysis, cross-referencing with non-java entities and source code generation.

The below diagram shows key model classes and their relationships. 
Some intermediate classes are omitted in the inheritance hierarchy.
See the [full diagram](diagram.html) for additional details.


```drawio-resource
java.drawio
```

## Maven dependency

[Maven Central Entry](https://central.sonatype.com/artifact/org.nasdanika.models.java/model)

```xml
<dependency>
    <groupId>org.nasdanika.models.java</groupId>
    <artifactId>model</artifactId>
    <version>latest version from Maven Central</version>
</dependency>
```

## Javadoc

[Latest](https://javadoc.io/doc/org.nasdanika.models.java/model/latest/org.nasdanika.models.java/module-summary.html)

## Loading 

### From sources

#### Individual sources

```java
ResourceSet resourceSet = new ResourceSetImpl();
resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("java", new JavaParserResourceFactory());		
		
String javaPackagePath = new File("src/main/java/org/nasdanika/models/java/JavaPackage.java").getCanonicalPath();
Resource javaPackageResource = resourceSet.getResource(URI.createFileURI(javaPackagePath), true);
```

#### Directory

```java
public void loadSourceDirectory() throws IOException {
	ResourceSet resourceSet = new ResourceSetImpl();
	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("java", new JavaParserResourceFactory());		

	// For loading directory contents
	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());		
	URIHandler fileDirectoryURIHandler = new DirectoryContentFileURIHandler();
	resourceSet.getURIConverter().getURIHandlers().add(0, fileDirectoryURIHandler);
	
	
	String javaSourcesPath = new File("src/main/java").getCanonicalPath();
	Resource javaSourcesResource = resourceSet.getResource(URI.createFileURI(javaSourcesPath), true);
	for (EObject root: javaSourcesResource.getContents()) {
		visit(root);
	}		
}

private void visit(EObject eObject) {
	System.out.println(eObject);
	if (eObject instanceof TreeItem) {
		System.out.println(((TreeItem) eObject).getName());
	}
	if (eObject instanceof Tree) {
		for (TreeItem treeItem: ((Tree) eObject).getTreeItems()) {
			URI itemURI = URI.createURI(treeItem.getName()).resolve(eObject.eResource().getURI().appendSegment(""));
			Resource itemResource = eObject.eResource().getResourceSet().getResource(itemURI, true);
			for (EObject root: itemResource.getContents()) {
				visit(root);
			}		
		}
	}		
}

```

#### With coverage

```java
File projectDir = new File("<path to a Maven project directory");
File jacocoExec = new File(projectDir, "target/jacoco.exec");
ResourceSet resourceSet = new ResourceSetImpl();		
resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
ModuleCoverage moduleCoverage = ModuleCoverage.loadJacoco("<module name>", jacocoExec, new File(projectDir, "target/classes"));
		
resourceSet
	.getResourceFactoryRegistry()
	.getExtensionToFactoryMap()
	.put(
		"java", 
		new JavaParserResourceFactory(new ModuleCoverageProvider(moduleCoverage)));		

...
```

### From class files

TODO


### From jar files

TODO

## Generation 

### Source

Low-level example - TODO - test case

### Compilation Unit




## Use Cases

### Analysis and documentation/code generation

[Nasdanika Rules](https://rules.models.nasdanika.org/) has a demo of inspecting Java sources and then generating test classes using 
OpenAI chat completions.
Sources are retrieved from GitLab and generated test classes are committed to GitLab.

The Java model combines both source and bytecode information, such as calls method makes, fields it accesses, or callers of a method.
This information may be used to generate documentation and visualizations such as UML diagrams.
It can also be used as part of GenAI prompts to generate documentation, recommendations, or test code. 
In the later case coverage information can be used to generate tests for classes and methods with low coverage.

Some insights which might be provided by Java analysis:

* Module - removal of direct dependencies if there is a transient dependency. Say C depends on A and B, B has A as a transitive dependency. There is no need for C to have a direct dependency on A - it doesn't hurt, though.
* Circular dependencies between packages. Sometimes such dependencies are inevitable, so this "rule" shall be parameterizable. E.g. exclude child packages, or have an annotation to indicate that a circular dependency is by design, similar to ``SuppressWarning`` annotation.

### Code generation

[Nasdanika Function Flow](https://function-flow.models.nasdanika.org/) leverages the Java model to generate code for Java source activities.
GenAI is used to generate code from high level descriptions (specification) and contextual information.
