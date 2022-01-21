FROM openjdk:11.0-jre

LABEL maintainer="kevogaba@gmail.com"

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cloud-gateway.jar
ENTRYPOINT ["java", "-jar", "cloud-gateway.jar"]

