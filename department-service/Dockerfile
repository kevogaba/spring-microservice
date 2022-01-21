FROM openjdk:11.0-jre

LABEL maintainer="kevogaba@gmail.com"

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} department-service.jar
ENTRYPOINT ["java", "-jar", "/department-service.jar"]

EXPOSE 9001
