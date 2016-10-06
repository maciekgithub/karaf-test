Configuration:
{code}
Karaf 4.0.7 with Eclipselink:
330 | Active | 80 | 3.2.0.v201302191141 | EclipseLink ANTLR
331 | Active | 80 | 5.0.1.v201405080102 | EclipseLink ASM
332 | Active | 80 | 2.6.1.v20150916-55dc7c3 | EclipseLink Core
333 | Active | 80 | 2.6.1.v20150916-55dc7c3 | EclipseLink JPA
334 | Active | 80 | 2.6.1.v20150916-55dc7c3 | EclipseLink Hermes Parser

and JPA support:

162 | Active | 80 | 2.3.0 | Apache Aries JPA Container API
163 | Active | 80 | 2.3.0 | Apache Aries JPA blueprint
164 | Active | 80 | 2.3.0 | Apache Aries JPA container
165 | Active | 80 | 2.3.0 | Apache Aries JPA support

Java:
Java(TM) SE Runtime Environment (build 1.8.0_101-b13)

OS:
Distributor ID: Ubuntu
Description: Ubuntu 14.04.4 LTS
Release: 14.04
Codename: trusty
{code}


Exception:
'''
2016-10-06 20:05:54,583 | ERROR | nsole user karaf | BlueprintContainerImpl           | 12 - org.apache.aries.blueprint.core - 1.6.2 | Unable to start blueprint container for bundle org.apach
e.aries.jpa.example.tasklist.model/3.0.0.SNAPSHOT
java.lang.IllegalArgumentException: Unknown namespace for jpa: http://cxf.apache.org/schemas/configuration/cxf-beans.xsd
        at org.apache.aries.jpa.blueprint.impl.JpaNsHandler.getSchemaLocation(JpaNsHandler.java:82)[163:org.apache.aries.jpa.blueprint:2.3.0]
        at org.apache.aries.blueprint.namespace.NamespaceHandlerRegistryImpl$NamespaceHandlerSetImpl$Loader.resolveResource(NamespaceHandlerRegistryImpl.java:538)[12:org.apache.aries.blueprin
t.core:1.6.2]
        at org.apache.xerces.util.DOMEntityResolverWrapper.resolveEntity(Unknown Source)[:]
        at org.apache.xerces.impl.XMLEntityManager.resolveEntity(Unknown Source)[:]
        at org.apache.xerces.impl.xs.XMLSchemaLoader.resolveDocument(Unknown Source)[:]
        at org.apache.xerces.impl.xs.traversers.XSDHandler.resolveSchema(Unknown Source)[:]
        at org.apache.xerces.impl.xs.traversers.XSDHandler.constructTrees(Unknown Source)[:]
        at org.apache.xerces.impl.xs.traversers.XSDHandler.parseSchema(Unknown Source)[:]
        at org.apache.xerces.impl.xs.XMLSchemaLoader.loadSchema(Unknown Source)[:]
        at org.apache.xerces.impl.xs.XMLSchemaLoader.loadGrammar(Unknown Source)[:]
        at org.apache.xerces.impl.xs.XMLSchemaLoader.loadGrammar(Unknown Source)[:]
        at org.apache.xerces.jaxp.validation.XMLSchemaFactory.newSchema(Unknown Source)[:]
        at org.apache.aries.blueprint.namespace.NamespaceHandlerRegistryImpl$NamespaceHandlerSetImpl.createSchema(NamespaceHandlerRegistryImpl.java:641)[12:org.apache.aries.blueprint.core:1.6.2]
        at org.apache.aries.blueprint.namespace.NamespaceHandlerRegistryImpl$NamespaceHandlerSet
'''
