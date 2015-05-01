@echo off
setlocal enabledelayedexpansion


set JAVA_OPTS=-Xmx128m %JAVA_OPTS%

java -jar ..\target\rabbimq-dsl*.jar %*
