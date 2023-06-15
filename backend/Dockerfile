# For Java 8, try this
# FROM openjdk:8-jdk-alpine
# For Java 11, try this
# FROM adoptopenjdk/openjdk11:alpine-jre
FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /backend
COPY ${APPLICATION_ROOT_FOLDER}/target/project-0.0.1-SNAPSHOT.jar /backend/project-0.0.1-SNAPSHOT.jar
RUN apk add curl
ENTRYPOINT ["java","-jar","project-0.0.1-SNAPSHOT.jar"]