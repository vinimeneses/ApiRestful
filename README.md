# Spring Boot RESTful Web Services

This project is a simple implementation of RESTful Web Services using Spring Boot, Java, and Maven. It provides basic CRUD (Create, Read, Update, Delete) operations for a `User` entity.

## Technologies Used

- Java
- Spring Boot
- Maven
- MySQL

## Features

The project provides the following endpoints:

- `POST /api/users`: Create a new user
- `GET /api/users/{id}`: Retrieve a user by ID
- `GET /api/users`: Retrieve all users
- `PUT /api/users/{id}`: Update a user by ID
- `DELETE /api/users/{id}`: Delete a user by ID

## Setup

1. Clone the repository
2. Update the `src/main/resources/application.properties` file with your MySQL database name, username, and password:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Run the application using Maven:

```bash
mvn spring-boot:run
```

The application will start running at `http://localhost:8080`.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
