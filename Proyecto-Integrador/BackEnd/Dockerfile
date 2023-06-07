FROM  mcr.microsoft.com/java/jdk:11-windowsservercore-ltsc2019
MAINTAINER thiago
COPY target/mgb-0.0.1-SNAPSHOT.jar  mgb-app.jar
ENTRYPOINT ["java","-jar","/mgb-app.jar"]