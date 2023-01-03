FROM eclipse-temurin:17-jdk-alpine
RUN ["mvnw", " clean install", "-Dmaven.test.skip=true"]
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
