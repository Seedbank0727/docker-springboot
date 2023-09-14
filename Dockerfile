FROM openjdk:11

COPY ./target/douzon_docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

