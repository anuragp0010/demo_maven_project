FROM openjdk:11
WORKDIR /
COPY target/customer-1.0.0-SNAPSHOT.jar customer-1.0.0-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java" ,"-jar","customer-1.0.0-SNAPSHOT.jar"]
