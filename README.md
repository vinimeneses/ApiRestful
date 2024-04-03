# Spring Boot Restful Web Services

This is a project for Spring Boot Restful Web Services.

## Description

This project is a demonstration of a RESTful API using Spring Boot. It includes a variety of dependencies such as Spring Boot Data JPA, Spring Boot Starter Web, MySQL Connector, Lombok, and more.

## Features

The application provides the following features:

- CRUD operations on User entities.
- Validation of User data.
- Error handling for invalid data and server errors.
- API documentation using Swagger.

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Boot Starter Web
- MySQL Connector
- Lombok
- ModelMapper
- Spring Boot Starter Validation
- Spring Boot Starter Actuator
- Spring Boot Devtools
- Springdoc OpenAPI UI

## Getting Started

### Prerequisites

- Java 17
- Maven
- MySQL

### Installing

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn clean install` to build the project

### Running the application

Run `mvn spring-boot:run` to start the application

## Usage

The application exposes a variety of endpoints for manipulating User entities. The full API documentation can be found at `http://localhost:8080/swagger-ui.html` when the application is running.

## API Endpoints

- `GET /users`: Fetch all users
- `GET /users/{id}`: Fetch a user by ID
- `POST /users`: Create a new user
- `PUT /users/{id}`: Update a user
- `DELETE /users/{id}`: Delete a user

## Contact

For any queries, please reach out to Vinícius Meneses at viniciusmenesesdev@gmail.com or visit [GitHub](https://github.com/vinimeneses).

## License

This project is licensed under the Apache 2.0 License - see the [LICENSE](http://www.apache.org/licenses/LICENSE-2.0.html) file for details.
