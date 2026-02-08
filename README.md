E-Commerce Application (Java + Spring Boot)
📌 Project Overview

This is a backend E-Commerce web application developed using Java and Spring Boot.
The application provides REST APIs for managing products, carts, and orders following a clean layered architecture.

This project is built for learning + interview demonstration of real-world backend development.

🛠️ Tech Stack

Java

Spring Boot

Spring Web (REST APIs)

Spring Data JPA

Hibernate

MySQL

Maven

IntelliJ IDEA

Git & GitHub

🧱 Project Architecture

The project follows Controller → Service → Repository architecture.

com.example.ecommerce
│
├── controller
│   ├── ProductController
│   ├── CartController
│   └── OrderController
│
├── service
│   ├── ProductService
│   ├── CartService
│   └── OrderService
│
├── repository
│   ├── ProductRepository
│   ├── CartRepository
│   └── OrderRepository
│
├── model
│   ├── Product
│   ├── Cart
│   └── Order
│
└── EcommerceApplication

✨ Features

Add, update, delete products

View product list

Add products to cart

Place orders

RESTful API design

Layered architecture

Database integration using JPA

🔗 API Endpoints (Sample)
Product APIs

POST /products → Add product

GET /products → Get all products

GET /products/{id} → Get product by ID

DELETE /products/{id} → Delete product

Cart APIs

POST /cart/add

GET /cart

Order APIs

POST /orders/place

GET /orders

⚙️ How to Run the Project
1️⃣ Prerequisites

JDK 17 or above

MySQL running

IntelliJ IDEA

2️⃣ Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run Application

Open EcommerceApplication.java

Click ▶ Run

App runs on:

http://localhost:8080

🧪 Testing

Use Postman to test APIs

Send JSON requests to endpoints

📚 What I Learned

Spring Boot project structure

REST API design

Dependency Injection

JPA & Hibernate

GitHub version control

Real-world backend flow

🎯 Future Enhancements

User authentication (JWT)

Payment integration

Order status tracking

Exception handling

Swagger API documentation

👤 Author

Nandan R
📌 GitHub: https://github.com/NandanR75/Ecommerce-java-project
