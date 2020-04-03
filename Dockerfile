FROM openjdk:11-slim-buster

EXPOSE 8080

ARG JAR_LOCATION=target
ARG JAR_NAME=speedment-spring-app
ARG JAR_VERSION=1.0.0

ADD ${JAR_LOCATION}/${JAR_NAME}-${JAR_VERSION}.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.speedment.host=sakila"]
