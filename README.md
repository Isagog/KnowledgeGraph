# KnowledgeGraph
Isagog Knowledge Graph service API specification

The Isagog platform for Knowledge Graphs consists in the following logical modules:

- [interaction](spec/kg-interact.yaml): user interaction interfaces
- [knowledge](spec/kg-knowledge.yaml): concept-level methods and structures
- [language](spec/kg-language.yaml): natural language processing methods and structures
- [data](spec/kg-data.yaml): instance-level manipulation, search and query methods


Each module is tagged and features a specific root path.

To generate the client API, move to the directory [kg-client](kg-java-client) and use the supplied [maven pom file](kg-java-client/pom.xml).
```
mvn [package | install] 

```

To generate the server stub, move to the directory [kg-server](kg-msf4j-server) and use the supplied [maven pom file](kg-msf4j-server/pom.xml) 

```
mvn [package | install] 

```

To generate the service executable jar, move to the directory [kg-service](kg-service) and use the supplied [maven pom file](kg-service/pom.xml)

```
mvn [package] 

```

You can also use the supplied [build script](build.sh)

Code generation can be configured generate any supplementary resource, refer to [openapi tools](https://github.com/OpenAPITools/openapi-generator) for details.


Here is a high-level sketch of the platform's architecture:

![User interaction](doc/KnowledgeGraphServOverview.jpg)

Service's functionalities are provided by 4 micro-services:

1. Data Service: CRUD and QUERY operations on the data layer
2. Knowledge Service: QUERY operations on the data conceptual schema (ontologies)
3. Language Service: NLP functionalities (document-level and sentence-level analysis)
4. Interaction Service: User interactions (e.g. dynamic query building) 






