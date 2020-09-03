java -jar openapi-generator-cli.jar generate ^
       -g java ^
       -i isagog-kg.yaml ^
       -o ..\client ^
       -c ..\client-config.json