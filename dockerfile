FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
RUN ["mvn", "package", "-Dmaven.test.skip"]
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
