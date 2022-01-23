Spring Microservices Example
--
The goal is to show how microservices implemented in Java using Spring Boot and Spring Cloud work.

The implementation consists of five microservices for demonstration purposes!

- `cloud-gateway`: this microservice implements load balancing and helps to declare URIs.

- `service-registry`: this microservice used to register all the other services that are running using eureka

- `hystrix-dashboard`: used to monitor the performance of the microservices.

- `department-service`: this microservice has department information.

- `user-service`: this microservice has user information and is linked to department microservice.


Technologies
--
- `Spring Boot`
- `API-Gateway`, used in declaring static paths and in load balancing
- `Eureka`, used for registering services 
- `Spring Cloud`, used for building Microservices applications in Java
- `Spring MVC`, for creating RESTful API
- `Docker`, for containerization of services
- `Docker-Compose`, to link the containers
- `Github Actions`, for CI/CD tasks and tests:
    - `test`: to test maven packaging
    - `sonar`: to perform code quality check
    - `artifact`: to publish(deploy) artifact in GitHub Packages
    - `docker`: to create docker images using docker-compose
- ** `Zipkin and Sleuth`, to trace the services and requests
- ** `Hystrix`, used in determining service status


### How to launch
First, you should install dependencies, build and package jar files with Maven.

//mvn clean install

//mvn clean package

Finally, by the docker-compose file, you can build the docker images and launch the application.

//docker-compose up



#### TODO:
hystrix.stream is not working, work on the configuration

Default configure zipkin and sleuth on your environment, dependencies already added.

Implement `cloud-config` where you save all your common configuration in a git repository.

Only implemented create and read functionalities, add update and delete functions.

On GitHub actions publish the images to DockerHub.
