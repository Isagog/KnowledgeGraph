# Isagog Knowledge Graph
Isagog Knowledge Graph OpenAPI specification.

The specification is modularized as follows:

- kg-openapi.yaml: main file (contains the full endpoint set)
- kg-knowledge.yaml: knowledge representation model
- kg-language.yaml: language representation model
- kg-interact.yaml: interaction model

The code generation can be obtained via Maven (mvn compile) or by manually launching the [openapi generator](https://github.com/OpenAPITools) on kg-openapi.yaml

