# Speedment - Spring App Example

[Speedment](https://github.com/speedment/speedment) is a Java ORM Toolkit and Runtime designed to simplify the development of database applications by providing a powerful Stream API as a means of interaction with the user's database of choice.

This repository contains an example Speedment project with Spring Boot support.

## Local setup

Before proceeding with the local setup, make sure you have the following dependencies installed:
- [JDK 11](https://openjdk.java.net/install/)
- [Maven](https://maven.apache.org/download.cgi)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/install/)

### Database instance

This example project uses [Sakila](https://dev.mysql.com/doc/sakila/en/), an Open Source MySQL database, as a storage option of choice. Before running the application, it is required that an instance of the database is available and running.

You can start a Sakila instance locally by executing the following command from the project root:
```
docker-compose up -d
```

Once done, you can terminate the local instance by executing the following command from the project root:
```
docker-compose down
```

### Running the Spring Boot app

Once you have the Sakila instance up and running, you can start the Spring Boot application by executing the following command from the project root:
```
mvn spring-boot:run
```

### Accessing OpenAPI documentation

OpenAPI documentation is provided in form of a Swagger UI which you can access at the following URL once your applicaition is up and running:
```
http://localhost:8080/swagger-ui.html
```

The UI contains documentation for all available REST API routes that can be used by end-users.

## Kubernetes deployment

Before proceeding with the local Kubernetes deployment, make sure you have the following depenencies installed:
- [Docker](https://www.docker.com/)
- [kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl/)
- [Minikube](https://kubernetes.io/docs/tasks/tools/install-minikube/)
- [Skaffold](https://skaffold.dev/docs/install/)

### Starting the local cluster

We will be using Minikube to manage our local Kubernets cluster. Execute the following command to start the cluster:
```
minikube start
```

To check if the cluster is up and running, execute the following command:
```
minikube status
```

If the cluster started succesfully, you will see the following output:
```
host: Running
kubelet: Running
apiserver: Running
kubeconfig: Configured
```

### Deploying to the cluster

We will be using Skaffold to manage the deployment process of our database and Spring Boot application.

Once your cluster is up and running, execute the following command from the project root:
```
skaffold dev --port-forward=true
```

This will build and deploy an instance of your application to the cluster alongside the Sakila database.

**Note**: The deployed application will most likely crash and restart a couple of times until the Sakila database is ready.