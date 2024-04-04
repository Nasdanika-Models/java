var searchDocuments = {"references/eClassifiers/ClassInitializer/inheritance.html":{"path":"ClassInitializer/Inheritance","action-uuid":"c94207db-46b8-4f06-a86d-bfbc98c591c0","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Class/inheritance.html":{"path":"Class/Inheritance","action-uuid":"662524e0-7aec-4aa7-b216-df8dc251a9a9","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/CompilationUnit/references/eOperations/merge-3/index.html":{"path":"CompilationUnit/Operations/merge","action-uuid":"9e7f2e60-9217-4134-9bf5-02e111d24d48","title":"merge","content":"Collects new source code from children and merges with the current code preserving manual changes in the current code"},"references/eClassifiers/AnnotationInterfaceMember/inheritance.html":{"path":"AnnotationInterfaceMember/Inheritance","action-uuid":"121a9b61-fede-479a-8b72-f99462550772","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Parameter/inheritance.html":{"path":"Parameter/Inheritance","action-uuid":"3d6b3382-10bc-4fc1-b079-03004da24cc5","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Method/inheritance.html":{"path":"Method/Inheritance","action-uuid":"a2a41394-e403-4f66-8cfe-5a39332976da","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/NamedElement/references/eStructuralFeatures/fullyQualifiedName/index.html":{"path":"NamedElement/Attributes/fullyQualifiedName","action-uuid":"3fa1d7ba-b4ac-4771-b5ae-b20d44966878","title":"fullyQualifiedName","content":"Fully qualified name where applicable. E.g. java.util.Map"},"references/eClassifiers/CompilationUnit/inheritance.html":{"path":"CompilationUnit/Inheritance","action-uuid":"00639ab6-3ca7-4028-bed8-096666740a3d","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/CompilationUnit/references/eOperations/merge-2/references/eParameters/source/index.html":{"path":"CompilationUnit/Operations/merge/Parameters/source","action-uuid":"21890ccf-01e4-4cd0-b823-732fb025355f","title":"source","content":"Source code to merge with the current code"},"references/eClassifiers/Source/references/eOperations/digest-1/index.html":{"path":"Source/Operations/digest","action-uuid":"f24fafb0-1ae0-448d-a3c7-e3813e2a908c","title":"digest","content":"Computes digest to be used by generators to detect manual changes"},"references/eClassifiers/TypeParameter/inheritance.html":{"path":"TypeParameter/Inheritance","action-uuid":"0f760e28-bac4-4fa8-9c93-8c655b366671","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/CompilationUnit/references/eOperations/merge-2/index.html":{"path":"CompilationUnit/Operations/merge","action-uuid":"5ef4fe7e-23fc-47af-8416-7d906c376ac5","title":"merge","content":"Merges new source code with the current code preserving manual changes in the current code"},"references/eClassifiers/Record/inheritance.html":{"path":"Record/Inheritance","action-uuid":"f3a24faf-bcb8-4afb-b86b-8875b9009670","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/NamedElement/inheritance.html":{"path":"NamedElement/Inheritance","action-uuid":"2daa0a59-a949-4ee4-9892-39c543ae6a4d","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Package/inheritance.html":{"path":"Package/Inheritance","action-uuid":"f8364f90-14aa-4d90-bd55-80cb20767985","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Interface/inheritance.html":{"path":"Interface/Inheritance","action-uuid":"4093322f-660c-40c1-a83f-da455c174ea0","title":"Inheritance","content":"Supertypes "},"index.html":{"action-uuid":"73560f69-7a86-4457-87b7-8554f1e3f189","title":"Java","content":"Nasdanika Java model can be used for analysis and code generation. It can be loaded from source files, class files and jar files. Model elements can reference coverage results. Model elements can be referenced from other models. For example, Maven project may reference a Java Module. File/resource top-level model elements, such as compilation units for *.java files and types for *.class files, are loaded as resources. It allows to use custom URI handlers to load resources from different sources. For example, GitLabURIHandler can be used to load sources from GitLab repositories using REST API, without cloning, and commit modifications to GitLab. Logical URI&rsquo;s, e.g. java://classes/org/nasdanika/common/Util may be used to reference model elements. Such logical URI&rsquo;s would be resolved to physical URI&rsquo;s, which may be different in different contexts - java sources or class files. Java model elements may be extended (subclassed) and subclasses can be loaded instead of the base classes. In the above example of a Maven project referencing a Java module, instead of a reference there might be a class, say MavenJar, extending both Maven project and Java module. Another example might be a JavaTextRepositoryFile extending both GitLab TextRepositoryFile and CompilationUnit. Yet another example, which might be combined with the above examples, is a class extending Maven project, Java module, and Architecture element This model is coarse-grained - it provides classes representing high-level &ldquo;externally referenceable&rdquo; constructs of the Java language. Low-level constructs such as statements and expressions are not modeled. Also, the model is somewhat loose on purpose to simplify code generation. For example, a source child can be added to any subclass of Source and source can be set to any text. The below diagram shows key model classes and their relationships. Some intermediate classes are omitted in the inheritance hierarchy. See the full diagram for additional details. Maven dependency Maven Central Entry &lt;dependency&gt;\n    &lt;groupId&gt;org.nasdanika.models.java&lt;/groupId&gt;\n    &lt;artifactId&gt;model&lt;/artifactId&gt;\n    &lt;version&gt;latest version from Maven Central&lt;/version&gt;\n&lt;/dependency&gt;\n Javadoc Latest Loading From sources Individual sources ResourceSet resourceSet = new ResourceSetImpl();\nresourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(&quot;java&quot;, new JavaParserResourceFactory());\t\t\n\t\t\nString javaPackagePath = new File(&quot;src/main/java/org/nasdanika/models/java/JavaPackage.java&quot;).getCanonicalPath();\nResource javaPackageResource = resourceSet.getResource(URI.createFileURI(javaPackagePath), true);\n Directory public void loadSourceDirectory() throws IOException {\n\tResourceSet resourceSet = new ResourceSetImpl();\n\tresourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(&quot;java&quot;, new JavaParserResourceFactory());\t\t\n\n\t// For loading directory contents\n\tresourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());\t\t\n\tURIHandler fileDirectoryURIHandler = new DirectoryContentFileURIHandler();\n\tresourceSet.getURIConverter().getURIHandlers().add(0, fileDirectoryURIHandler);\n\t\n\t\n\tString javaSourcesPath = new File(&quot;src/main/java&quot;).getCanonicalPath();\n\tResource javaSourcesResource = resourceSet.getResource(URI.createFileURI(javaSourcesPath), true);\n\tfor (EObject root: javaSourcesResource.getContents()) {\n\t\tvisit(root);\n\t}\t\t\n}\n\nprivate void visit(EObject eObject) {\n\tSystem.out.println(eObject);\n\tif (eObject instanceof TreeItem) {\n\t\tSystem.out.println(((TreeItem) eObject).getName());\n\t}\n\tif (eObject instanceof Tree) {\n\t\tfor (TreeItem treeItem: ((Tree) eObject).getTreeItems()) {\n\t\t\tURI itemURI = URI.createURI(treeItem.getName()).resolve(eObject.eResource().getURI().appendSegment(&quot;&quot;));\n\t\t\tResource itemResource = eObject.eResource().getResourceSet().getResource(itemURI, true);\n\t\t\tfor (EObject root: itemResource.getContents()) {\n\t\t\t\tvisit(root);\n\t\t\t}\t\t\n\t\t}\n\t}\t\t\n}\n\n With coverage File projectDir = new File(&quot;&lt;path to a Maven project directory&quot;);\nFile jacocoExec = new File(projectDir, &quot;target/jacoco.exec&quot;);\nResourceSet resourceSet = new ResourceSetImpl();\t\t\nresourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());\nModuleCoverage moduleCoverage = ModuleCoverage.loadJacoco(&quot;&lt;module name&gt;&quot;, jacocoExec, new File(projectDir, &quot;target/classes&quot;));\n\t\t\nresourceSet\n\t.getResourceFactoryRegistry()\n\t.getExtensionToFactoryMap()\n\t.put(\n\t\t&quot;java&quot;, \n\t\tnew JavaParserResourceFactory(new ModuleCoverageProvider(moduleCoverage)));\t\t\n\n...\n From class files TODO From jar files TODO Generation Source Low-level example - TODO - test case Compilation Unit Use Cases Analysis and documentation/code generation Nasdanika Rules has a demo of inspecting Java sources and then generating test classes using OpenAI chat completions. Sources are retrieved from GitLab and generated test classes are committed to GitLab. The Java model combines both source and bytecode information, such as calls method makes, fields it accesses, or callers of a method. This information may be used to generate documentation and visualizations such as UML diagrams. It can also be used as part of GenAI prompts to generate documentation, recommendations, or test code. In the later case coverage information can be used to generate tests for classes and methods with low coverage. Some insights which might be provided by Java analysis: Module - removal of direct dependencies if there is a transient dependency. Say C depends on A and B, B has A as a transitive dependency. There is no need for C to have a direct dependency on A - it doesn&rsquo;t hurt, though. Circular dependencies between packages. Sometimes such dependencies are inevitable, so this &ldquo;rule&rdquo; shall be parameterizable. E.g. exclude child packages, or have an annotation to indicate that a circular dependency is by design, similar to SuppressWarning annotation. Code generation Nasdanika Function Flow leverages the Java model to generate code for Java source activities. GenAI is used to generate code from high level descriptions (specification) and contextual information. Source Compilation Unit Package Module Member Type Field Code Operation Method Constructor Class Interface Enum Annotation Interface Record Annotation Interface Member EnumConstant Initializer Class Initializer"},"references/eClassifiers/Source/references/eOperations/digest-1/references/eParameters/predicate/index.html":{"path":"Source/Operations/digest/Parameters/predicate","action-uuid":"3d30ecc6-239b-4061-a0f5-f2b02df254dc","title":"predicate","content":"Predicate allows to exclude model element for digest computation, e.g. Generated annotation"},"references/eClassifiers/Code/inheritance.html":{"path":"Code/Inheritance","action-uuid":"c0eca7ac-b32e-4354-9320-9b89d49e0018","title":"Inheritance","content":"Supertypes Subtypes  "},"glossary.html":{"action-uuid":"0bc3c582-2536-4a5d-9c3f-9d3a80631b16","title":"Glossary","content":"Clear Identifier(s) Hide UUID {{data.value.name}} {{data.value[0].value}} {{item.value}}"},"references/eClassifiers/Reference/references/eStructuralFeatures/target/index.html":{"path":"Reference/References/target","action-uuid":"2b6c824d-424a-4bae-a94e-ef73ce95d9ba","title":"target","content":"Referenced named element"},"references/eClassifiers/Type/references/eStructuralFeatures/supertypes/index.html":{"path":"Type/References/supertypes","action-uuid":"8bb3326e-b76a-4a79-b484-8be4b045a2ae","title":"supertypes","content":"For classes the first element is the superclass and the rest are implemented interfaces"},"references/eClassifiers/EnumConstant/inheritance.html":{"path":"EnumConstant/Inheritance","action-uuid":"c80800c2-9f89-458c-b0a0-18ca41c2b815","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Field/inheritance.html":{"path":"Field/Inheritance","action-uuid":"17e7d3e1-edb3-4df2-b018-a04bb25b1d84","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/GenericType/inheritance.html":{"path":"GenericType/Inheritance","action-uuid":"e49701cf-feb4-468e-ab66-187dee7362f9","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/FieldAccess/references/eStructuralFeatures/field/index.html":{"path":"FieldAccess/References/field","action-uuid":"2386ee33-c140-4ea5-91ef-08a8ddf55cd2","title":"field","content":"Fully qualified field name"},"references/eClassifiers/Type/inheritance.html":{"path":"Type/Inheritance","action-uuid":"28dc8aaa-67cb-4e07-959b-18aa9c81fc97","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Initializer/inheritance.html":{"path":"Initializer/Inheritance","action-uuid":"aac59c1c-b94d-49b2-92be-0cdc3571ad54","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Module/inheritance.html":{"path":"Module/Inheritance","action-uuid":"62bf5986-f026-4181-9f29-f6e37955011e","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Source/inheritance.html":{"path":"Source/Inheritance","action-uuid":"b5232b7f-768a-4d49-9ddf-fdcc388b5dce","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Constructor/inheritance.html":{"path":"Constructor/Inheritance","action-uuid":"eaeb5189-55c3-4ab5-8092-87fa56b0f247","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/NamedElement/references/eStructuralFeatures/name/index.html":{"path":"NamedElement/Attributes/name","action-uuid":"d42a88f7-27d1-422b-8bab-da9911c62d1a","title":"name","content":"Simple (short) name. E.g. Map"},"references/eClassifiers/TypedElement/inheritance.html":{"path":"TypedElement/Inheritance","action-uuid":"39c94659-889e-4bcd-a122-60e1cb23fb9d","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Member/inheritance.html":{"path":"Member/Inheritance","action-uuid":"3772fd48-8d14-4043-a578-f5e135de599d","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Operation/inheritance.html":{"path":"Operation/Inheritance","action-uuid":"3ddd55ac-60f3-408d-bcec-e93562b7c7ee","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Type/references/eStructuralFeatures/permits/index.html":{"path":"Type/References/permits","action-uuid":"b3623408-d159-454f-b38c-f6d26eb63a60","title":"permits","content":"For classes the first element is the superclass and the rest are implemented interfaces"},"references/eClassifiers/Annotation/inheritance.html":{"path":"Annotation/Inheritance","action-uuid":"4aedbe3b-974e-4f51-b96b-e33edb6d5dbc","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Enum/inheritance.html":{"path":"Enum/Inheritance","action-uuid":"415135c4-b098-4728-8605-f1759751500b","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/AnnotationInterface/inheritance.html":{"path":"AnnotationInterface/Inheritance","action-uuid":"986bb860-d1fd-4930-89bd-3cd7ee46a1df","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Member/references/eStructuralFeatures/referencedTypes/index.html":{"path":"Member/References/referencedTypes","action-uuid":"14c4b9ff-e5bc-4578-af92-9b3ceb382a48","title":"referencedTypes","content":"All types referenced by this member including types refernced from code"},"references/eClassifiers/Reference/inheritance.html":{"path":"Reference/Inheritance","action-uuid":"f5813330-0317-485c-bc55-567cb10a2cbc","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Source/references/eOperations/update-0/index.html":{"path":"Source/Operations/update","action-uuid":"e28596a1-efb7-45e9-90f2-e7c60b4a8ebf","title":"update","content":"Calls update on children and then updates source code using children source code. Returns updated source code."}}