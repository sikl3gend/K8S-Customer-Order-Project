FROM openjdk:19
EXPOSE 8080
ADD target/Spring-CRUD-Kubernetes-0.0.1-SNAPSHOT.jar spring-CRUD-Kubernetes.jar
ENTRYPOINT ["java", "-jar", "spring-CRUD-Kubernetes.jar"]