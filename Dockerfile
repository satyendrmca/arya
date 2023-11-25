FROM openjdk:8
EXPOSE 9090
ADD target/demo-1-0.0.1-SNAPSHOT.jar demo-1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-1-0.0.1-SNAPSHOT.jar"]
