📦 Product Management System API

A RESTful API for managing products, built with Java Spring Boot and an H2 in-memory database.
This project demonstrates CRUD operations for products and is suitable for learning, prototyping, or small-scale applications.

🚀 Features

Add new products

->Fetch all products or a specific product by ID
->Update product details
->Delete products
->In-memory H2 database (auto-reset on restart)
->Error handling with proper HTTP status codes

🛠️ Tech Stack

->Java 17+
->Spring Boot (REST API framework)
->Spring Data JPA (Database operations)
->Hibernate (ORM)
->H2 Database (In-memory database)
->Maven/Gradle (Build tool)

⚙️ Setup & Installation

1️⃣ Clone the repository
git clone https://github.com/yourusername/product-management-api.git
cd product-management-api

2️⃣ Configure H2 Database

In application.properties (default setup):

spring.datasource.url=jdbc:h2:mem:productdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username="username"
spring.datasource.password="password"
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update

3️⃣ Run the application

Using Maven:

mvn spring-boot:run


Or using Java:

./mvnw spring-boot:run

🌐 Access H2 Console

After running the application, open:
👉 http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:productdb

Username: "XXXX"

Password: (leave blank)

📌 API Endpoints:
--->POST /api/products          (➕ Create a Product)
--->GET /api/products           (📂 Get All Products)
--->GET /api/products/{id}      (🔍 Get Product by ID)
--->DELETE /api/products/{id}   (❌ Delete a Product)
