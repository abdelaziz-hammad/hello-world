# Hello World Spring Boot Application

A simple Spring Boot application that demonstrates basic REST endpoints.

*Last Updated: July 19, 2025*

### Overview

This project is a Spring Boot application that provides simple REST endpoints returning greeting messages. It serves as a basic demonstration of Spring Boot's web capabilities.

### Technologies Used

- Java 21
- Spring Boot 3.5.3
- Maven
- JUnit 5 for testing
- JaCoCo 0.8.13 for code coverage

### Prerequisites

- JDK 21 or later
- Maven 3.6.3 or later

### Getting Started

#### Clone the repository

```bash
git clone https://github.com/abdelaziz-hammad/hello-world.git
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


You can run the tests using the Maven Wrapper:
```bash
./mvnw clean test
```
You can also run the tests using the system-installed Maven:
```bash
mvn clean test
```

The test suite includes:
- `CheckHTTPResponseTest`: Verifies that both endpoints (root and `/welcome`) return the expected greeting messages
- `HelloWorldApplicationTests`: Verifies that the application context loads correctly and tests the main method

After running tests, JaCoCo generates code coverage reports in the `target/site/jacoco` directory. You can open `target/site/jacoco/index.html` in a browser to view the coverage results.

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
├── target/
│   └── site/
│       └── jacoco/                               # JaCoCo code coverage reports
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

