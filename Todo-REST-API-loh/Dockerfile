FROM openjdk:8
VOLUME /tmp
ARG JAR_FILE=target/spring-boot-docker-todo.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]