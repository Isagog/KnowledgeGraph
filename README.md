# KnowledgeGraph
Isagog Knowledge Graph service API specification

The Isagog platform for Knowledge Graphs consists in the following logical modules:

- [interaction](spec/kg-interact.yaml): user interaction interfaces
- [knowledge](spec/kg-knowledge.yaml): concept-level methods and structures
- [language](spec/kg-language.yaml): natural language processing methods and structures
- [data](spec/kg-openapi.yaml): instance-level manipulation, search and query methods


Each module is tagged and features a specific root path.

The supplied [maven pom file](client/pom.xml) produces a java client and may be adapted to generate a variety of other clients or server stubs by [openapi tools](https://github.com/OpenAPITools/openapi-generator)

Here is a high-level picture of the platform's architecture, as it unfolds in the two main use cases:

![User interaction](doc/kg-user-interact.PNG)

This picture shows how a user utterance should be processed.
1. The utterance (raw text) is received by the interaction service and forwarded to the language service.
2. The language service gives back an annotation structure over the given sentence, or a rebuttal message.
3. The interaction service sends the annotated sentence to the knowledge service, which tries to build conceptual frames upon it (here is most of the magic!).
4. The interaction service selects the best frame candidate ans sends it to the user to review.
5. The interaction service dispatches the curated frame to the data service, based on its type, i.e. Query or Update. Users' frame curation may feed a continuous learning process. 
6. The data service result flows to the interaction service and then to the user.



![Data ingestion](doc/kg-data-ingest.PNG)

Here is a sketch of the data ingestion, i.e. texts such as documents or mails, or rdf files previously prepared.
1. The ingestion service discriminates the file type: it sends texts to the language service for content analysis, and structured data (e.g. csv) to the knowledge service for conceptualization.
2. The ingestion service pulls the textual content in the document store, and possibly the extracted triples in the data store.



 





