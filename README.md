# K8s-crud-app

This project stands out from others because it is entirely containerized with Docker, and orchestrated with Kubernetes. I developed a server that exposes an endpoint for creating customer orders. You are able to use a RESTful client to send raw JSON data and have it mapped to a MySQL database. 

Tech used:

    Spring Boot: 
          Create the server
    
    Maven: 
          Build the app into a single jar file with all of its dependencies
    
    Docker:
          Containerize application 
    
    Minikube:
          Start a cluster
          Deploy the app and MySQL images
          Apply services and secrets for deployments
