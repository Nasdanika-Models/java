# Java

Ecore model, graph nodes, and processors for Java - module, package, class, field, method, compilation unit, ...

* Module - model after the Java API for modules - https://github.com/Nasdanika-Models/echarts/blob/main/generator/src/test/java/org/nasdanika/models/echarts/generator/tests/TestEchartsModelDocGen.java#L232. 
Loading using Java lang API and from sources - http://javaparser.org/, https://github.com/javaparser/javaparser, Eclipse JDT

* Class, Package, CompilationUnit, ... - model after https://github.com/Nasdanika/core/tree/maven-2021.7.3/exec/src/main/java/org/nasdanika/exec/java

Use cases:

* Visualization of module dependencies
* Integration with the [GitLab](https://github.com/Nasdanika-Models/gitlab) model - scan repositories, load module-info.java, parse, establish cross-repository dependencies, use [CODEOWNERS](https://docs.gitlab.com/ee/user/project/codeowners/), project contributors and other means to map to the org structure and infer org units/teams dependencies
    * Automated governance, e.g. naming conventions - group/project name, Maven artifacts name, module name, package names.
* Code generation
    
    
