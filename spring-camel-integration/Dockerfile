FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app

COPY src /app/src
COPY pom.xml /app

RUN mvn clean package

FROM openjdk:17-slim
WORKDIR /app

COPY --from=build /app/target/spring-camel-integration-*.jar /app/spring-camel-integration.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-camel-integration.jar"]