#!/bin/sh

mvn clean package
cp target/rabbitmq-dsl*.jar bin/
