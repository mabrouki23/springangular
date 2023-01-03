FROM eclipse-temurin:17-jdk-alpine
WORKDIR /applications
COPY target/*.jar applications/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
