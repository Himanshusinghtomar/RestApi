# README: Spring Boot REST API with Automatic Configuration

This README provides guidance on creating a REST API using Spring Boot with a focus on Spring Boot's automatic configuration and port configuration in the `application.yml` file. Spring Boot is a powerful framework that simplifies the setup and development of Spring-based applications.

## Prerequisites

Before you begin, ensure you have the following prerequisites:

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (Java 8 or later)
- [Spring Boot](https://spring.io/projects/spring-boot)
- A code editor or integrated development environment (IDE) like [Eclipse](https://www.eclipse.org/) or [IntelliJ IDEA](https://www.jetbrains.com/idea/)

## Project Setup

1. **Create a Spring Boot Project:**

   You can create a Spring Boot project using Spring Initializer (https://start.spring.io/) or your preferred IDE. Ensure that you include the following dependencies:
   
   - Spring Web (for building REST APIs)

2. **Configure `application.yml`:**

   In the `src/main/resources` directory, you'll find an `application.yml` (or `application.properties`) file. This is where you can configure various aspects of your Spring Boot application, including the port it listens on. Here's an example `application.yml` with port configuration:

   ```yaml
   server:
     port: 8080
   ```

   - `port`: Set the desired port for your application.

3. **Create REST Controller:**

   Create REST controllers to expose endpoints for your API. Use annotations like `@RestController`, `@GetMapping`, `@PostMapping`, `@PutMapping`, and `@DeleteMapping`. For example:

   ```java
   @RestController
   @RequestMapping("/api")
   public class MyController {
       @GetMapping("/hello")
       public String sayHello() {
           return "Hello, World!";
       }
   }
   ```

4. **Run Your Application:**

   You can run your Spring Boot application using your IDE or by using the following command in the project's root directory:

   ```
   ./mvnw spring-boot:run
   ```

   Your REST API should now be accessible at the specified port (e.g., `http://localhost:8080/api/hello`).

## Conclusion

You've now set up a simple REST API using Spring Boot with automatic configuration and port configuration in the `application.yml` file. Spring Boot greatly simplifies the process of building and running Spring-based applications, allowing you to focus on your business logic. Explore Spring Boot documentation for more advanced features and customization options.

Happy coding!
