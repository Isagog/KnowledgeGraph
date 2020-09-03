java -jar openapi-generator-cli.jar generate ^
       -g java-msf4j ^
       -i isagog-kg.yaml ^
       -o ..\server ^
       -c server-config.json