# Week 06 & 07 - Java Backend - Spring Boot

Welcome to Weeks 6 and 7 of our Java learning journey!  
These weeks focus on backend development using **Spring Boot**, one of the most widely used Java frameworks for building robust, scalable web applications.

## 📑 Table of Contents
- [Overview](#overview)
- [Topics Covered](#topics-covered)
  - [Day 1: Tomcat Servlet](#day-1-tomcat-servlet)
  - [Day 2: Spring Boot Introduction](#day-2-spring-boot-introduction)
  - [Day 3: REST API Calls and Request Handling](#day-3-rest-api-calls-and-request-handling)
  - [Day 4: Spring Multi-Layer Architecture with H2 Database](#day-4-spring-multi-layer-architecture-with-h2-database)
  - [Day 5: Spring Boot Employee Payroll App with Service Layer](#day-5-spring-boot-employee-payroll-app-with-service-layer)
  - [Day 6: Application Settings, Validators, and Exception Handlers](#day-6-application-settings-validators-and-exception-handlers)
  - [Days 8–12: Spring Boot Workshop](#days-8-12-spring-boot-workshop)
- [Prerequisites](#prerequisites)
- [How to Use This Repository](#how-to-use-this-repository)
- [Next Steps](#next-steps)

## 🧠 Overview

In these two weeks, you will build a strong foundation in Spring Boot and learn how to develop REST APIs using a layered architecture. You’ll also explore working with databases using Spring Data JPA and the H2 in-memory database, and finally MySQL integration for persistent data storage.

## 📘 Topics Covered

### Day 1: Tomcat Servlet
- Overview of web servers and HTTP protocol  
- Introduction to Apache Tomcat  
- Writing and deploying your first Java Servlet  
- Understanding web.xml configuration and servlet lifecycle  

### Day 2: Spring Boot Introduction
- What is Spring and Spring Boot?  
- Advantages of Spring Boot over traditional Spring  
- Creating a Spring Boot project with Spring Initializr  
- Understanding annotations like `@SpringBootApplication`, `@Component`, `@Autowired`  

### Day 3: REST API Calls and Request Handling
- Introduction to RESTful APIs  
- Using `@RestController`, `@RequestMapping`, `@GetMapping`, and `@PostMapping`  
- Handling path variables and request parameters  
- Testing APIs using Postman or Swagger  

### Day 4: Spring Multi-Layer Architecture with H2 Database
- Creating Entity classes with JPA annotations  
- Designing multi-layer architecture: Controller, Service, Repository  
- Introduction to H2 in-memory database and integration setup  
- Performing CRUD operations using Spring Data JPA  

### Day 5: Spring Boot Employee Payroll App with Service Layer
- Building a mini payroll system from scratch  
- Writing business logic in the Service Layer  
- Creating REST endpoints to manage employees  
- Testing full flow with H2 database persistence

### Day 6: Application Settings, Validators, and Exception Handlers
- Managing environment-specific configurations using `application.properties`  
- Adding validations with annotations like `@NotNull`, `@Size`, `@Pattern`  
- Creating custom exception classes and handling them with `@ControllerAdvice`  
- Global exception handling for REST APIs

### Days 8–12: Spring Boot Workshop
- Hands-on project building  
- Integrating learned concepts  
- Debugging, testing, and final submission  

## 🛠️ Prerequisites

- Completion of Week 5 (IO Programming and Annotations)
- JDK 17+ installed  
- Maven build tool installed and configured  
- IntelliJ IDEA or Eclipse with Spring support  
- Familiarity with:
  - Using Spring Initializr to generate projects  
  - Basics of HTTP/REST APIs  
- Postman or Swagger for API testing  
- No need to install Apache Tomcat separately — Spring Boot comes with embedded Tomcat

## 📂 How to Use This Repository

The repository is organized by each day. You will find working Spring Boot projects, practice code, and assignment submissions inside the respective branches.

| Day      | Topic Description                                                                                                         |
|----------|---------------------------------------------------------------------------------------------------------------------------|
| Day 1    | [Tomcat Servlet](https://github.com/KeerthanaaLN/Week6-7-Java-Backend-Spring-Boot/tree/Day1)                             |
| Day 2    | [Spring Boot Introduction](https://github.com/KeerthanaaLN/Week6-7-Java-Backend-Spring-Boot/tree/Day2)                   |
| Day 3    | [REST API Calls and Request Handling](https://github.com/KeerthanaaLN/Week6-7-Java-Backend-Spring-Boot/tree/Day3)        |
| Day 4    | [Spring Multi-Layer Architecture with H2 Database](https://github.com/KeerthanaaLN/Week6-7-Java-Backend-Spring-Boot/tree/Day4) |
| Day 5    | [Spring Boot Employee Payroll App with Service Layer](https://github.com/KeerthanaaLN/Week6-7-Java-Backend-Spring-Boot/tree/Day5) |
| Day 6    | [Application Settings, Validators, and Exception Handlers](https://github.com/KeerthanaaLN/Week6-7-Java-Backend-Spring-Boot/tree/Day6) |
| Day 8-12 | [Spring Boot Workshop](https://github.com/KeerthanaaLN/Week6-7-Java-Backend-Spring-Boot/tree/Day8-12)                     |

## ⏭️ Next Steps

- Review and refactor completed projects  
- Practice adding more features to your Payroll App  
- Prepare for advanced Spring topics (Security, Swagger, etc.)
