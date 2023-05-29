FROM openjdk:8
EXPOSE 5000
ADD target/microservice-press.jar microservice-press.jar
ENTRYPOINT ["java","-jar","/microservice-press.jar"]