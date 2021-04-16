#!/bin/bash

cd kg-java-client || exit 1
mvn clean install
echo "API CLIENT INSTALLED"
cd ../kg-msf4j-server || exit 1
mvn clean compile
mvn install -Dmaven.main.skip=true
echo "SERVER STUB INSTALLED"
cd ../kg-service || exit 1
mvn clean package
echo "SERVICE PACKAGED"
cd ../
echo "DONE"

