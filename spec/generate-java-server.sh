#!/bin/bash

java -jar D:\Tools\openapi-generator\modules\openapi-generator-cli\target\openapi-generator-cli.jar generate \
       -g java-msf4j \
       -i D:\Projects\Isagog\KnowledgeGraph\spec\isagog-kg.yaml \
       -o D:\Projects\Isagog\KnowledgeGraph\server \
       -c D:\Projects\Isagog\KnowledgeGraph\spec\server-config.json