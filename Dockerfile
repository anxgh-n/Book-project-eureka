FROM openjdk:17-oracle
COPY ./target/eurekabook-0.0.1-SNAPSHOT.jar eurekabook.jar
CMD ["java","-jar","eurekabook.jar"]
