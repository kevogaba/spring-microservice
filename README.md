Technologies
------------
- `Spring Boot`
- `Hystrix`, used in determining service status.
- `API-Gateway`, used in declaring static paths and load balancing
- `Cloud Config`, for saving comfigurations in cloud 
- `Eureka`, used for registering services 
- `Spring Cloud`, used for building Microservices applications in Java
- `Spring MVC`, for creating RESTful API
- `Docker`, for containerization of services
- `Docker-Compose`, to link the containers


### How to launch
First, you should build and package jar files with Maven.

//mvn clean package

Then, I provided a docker file for each microservice, so you should create an image for each microservice.

//docker build -t service-registry .

//docker build -t cloud-gateway .

//docker build -t hystrix-dashboard .

//docker build -t department-service .

//docker build -t user-service .


Finally, by the docker-compose file, you can launch it.

//docker-compose up

