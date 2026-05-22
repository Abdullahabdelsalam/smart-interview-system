# Smart Interview Management System

Production-style backend project built using Spring Boot for managing interview jobs and recruitment processes through RESTful APIs.

This project demonstrates core backend development concepts including layered architecture, REST APIs, CRUD operations, database integration, exception handling, logging, monitoring, and environment-based configuration.

---

## Features

- RESTful APIs
- CRUD Operations
- Layered Architecture
- Spring Data JPA
- MySQL Integration
- Global Exception Handling
- Logging with SLF4J
- Spring Boot Profiles
- YAML Configuration
- Spring Boot Actuator
- Dependency Injection
- HTTP Status Codes
- API Testing with Postman
- Maven Dependency Management

---

## Tech Stack

| Technology | Usage |
|---|---|
| Java 21 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Database Access |
| Hibernate | ORM Framework |
| MySQL | Relational Database |
| Maven | Dependency Management |
| Postman | API Testing |
| Lombok | Boilerplate Reduction |

---

## Project Architecture

```text
Client
   ↓
Controller Layer
   ↓
Service Layer
   ↓
Repository Layer
   ↓
Database
```

---

## Project Structure

```text
src/main/java/com/interview/smartinterviewsystem

├── controller
├── service
├── repository
├── entity
├── exception
```

---

## REST APIs

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/jobs | Create Job |
| GET | /api/jobs | Get All Jobs |
| GET | /api/jobs/{id} | Get Job By ID |
| PUT | /api/jobs/{id} | Update Job |
| DELETE | /api/jobs/{id} | Delete Job |

---

## Sample JSON Request

```json
{
  "title": "Java Developer",
  "department": "Backend",
  "description": "Spring Boot Developer"
}
```

---

## Configuration

### application.yml

```yaml
server:
  port: 8080

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/interview_system
    username: root
    password: root

  jpa:
    hibernate:
      ddl-auto: update

    show-sql: true
```

---

## Spring Boot Profiles

The project supports multiple environments:

- Development
- Production

Files:

```text
application-dev.yml
application-prod.yml
```

---

## Logging

Implemented using:

- SLF4J
- Logback

Example:

```java
logger.info("Fetching all jobs");
```

---

## Spring Boot Actuator

Available endpoints:

```text
/actuator
/actuator/health
/actuator/info
```

---

## Exception Handling

Global exception handling implemented using:

```java
@RestControllerAdvice
```

Custom exception example:

```java
ResourceNotFoundException
```

---

## Run the Project

### Clone Repository

```bash
git clone <repository-url>
```

---

### Configure Database

Create MySQL database:

```sql
CREATE DATABASE interview_system;
```

---

### Run Application

```bash
mvn spring-boot:run
```

---

## API Testing

You can test APIs using:

- Postman
- curl

Example:

```bash
curl -X GET http://localhost:8080/api/jobs
```

---

## Learning Objectives

This project was built to practice:

- Spring Boot Fundamentals
- REST API Development
- Backend Architecture
- JPA & Hibernate
- Exception Handling
- Logging
- Environment Configuration
- API Testing
- Production Concepts

---

## Future Improvements

- DTO Layer
- Validation
- Pagination & Sorting
- Search APIs
- Authentication & Authorization
- Swagger Documentation
- Docker Support
- Unit Testing

---

## Author

Abdullah Shams

Backend Developer | Java & Spring Boot Enthusiast

---
