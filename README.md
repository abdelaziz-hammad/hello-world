# Hello World Spring Boot Application

A simple Spring Boot application that demonstrates basic REST endpoints.

### Overview

This project is a Spring Boot application that provides simple REST endpoints returning greeting messages. It serves as a basic demonstration of Spring Boot's web capabilities.

### Technologies Used

- Java 21
- Spring Boot 3.5.3
- Maven
- JUnit 5 for testing

### Prerequisites

- JDK 21 or later
- Maven 3.6.3 or later

### Getting Started

#### Clone the repository

```bash
git clone <repository-url>
cd hello-world
```

#### Build the application

```bash
./mvnw clean install
```

#### Run the application

```bash
./mvnw spring-boot:run
```

The application will start on port 8080 (default).

### API Endpoints

| Endpoint | Method | Description | Response |
|----------|--------|-------------|----------|
| `/` | GET | Returns a simple greeting message | "Hello World from Spring Boot!" |
| `/welcome` | GET | Returns a welcome message in French | "Bienvenue à Spring Boot!" |

### Testing

The application includes automated tests to verify the HTTP responses:

```bash
./mvnw test
```

The test suite includes:
- `CheckHTTPResponseTest`: Verifies that the root endpoint returns the expected greeting message

### Project Structure

```
hello-world/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/springdemo/helloworld/
│   │   │       ├── HelloWorldApplication.java    # Main application class
│   │   │       └── HelloWorldController.java     # REST controller with endpoints
│   │   └── resources/
│   └── test/
│       └── java/
│           └── com/springdemo/helloworld/
│               ├── CheckHTTPResponseTest.java    # HTTP response tests
│               └── HelloWorldApplicationTests.java # Application context tests
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.3/maven-plugin)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.3/reference/web/servlet.html)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### License

This project is licensed under the [MIT License](LICENSE).