FROM openjdk:15-jdk-alpine
LABEL maintainer="rudeigerc@gmail.com"
WORKDIR /app
COPY target/*.jar /app
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
