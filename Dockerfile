FROM openjdk:15-jdk-alpine
LABEL maintainer="rudeigerc@gmail.com"
WORKDIR /app
COPY target/*.jar /app
ENTRYPOINT ["java", "-jar", "*.jar"]
EXPOSE 8080
