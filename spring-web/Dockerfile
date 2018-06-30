FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} webapp.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/webapp.jar"]