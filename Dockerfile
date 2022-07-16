FROM maven:3.6-jdk-8-slim
WORKDIR /sample
COPY src /sample/src
COPY pom.xml /sample
RUN mvn -f /sample/pom.xml clean package -Denforcer.skip=true



