FROM openjdk:17-alpine
EXPOSE 8080
ADD target/Spring3Example-1.0-SNAPSHOT.jar Spring3Example-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Spring3Example-1.0-SNAPSHOT.jar"]