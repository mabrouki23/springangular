FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
RUN ["mvn", " clean install", "-Dmaven.test.skip=true"]
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
