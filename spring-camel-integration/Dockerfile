# Stage 1: Build with Maven
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
# Copy your src directory and pom.xml to the image
COPY src /app/src
COPY pom.xml /app
# Package your application
RUN mvn clean package

# Stage 2: Run with OpenJDK
FROM openjdk:17-slim
WORKDIR /app
# Copy the jar from the build stage to the /app directory of the running stage
COPY --from=build /app/target/spring-camel-integration-*.jar /app/spring-camel-integration.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-camel-integration.jar"]
