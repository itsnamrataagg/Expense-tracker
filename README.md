# Expense-tracker
📌 Introduction

Expense Tracker is a Spring Boot based web application to manage personal expenses.
It provides CRUD (Create, Read, Update, Delete) operations for users and their expense details using MySQL as the database.

⚙️ Technologies Used

Java (Spring Boot, JDBC, JPA, Hibernate)

Maven (Dependency Management)

MySQL (Database)

🚀 Features

Add new users with expense details

Update user details (name, email, balance)

Delete users

View all users

Fetch user by ID

🗄️ Database Setup

Open MySQL and create a database:

CREATE DATABASE expense_db;


Update your application.properties file:

spring.datasource.url=jdbc:mysql://localhost:3306/expense_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


▶️ How to Run

Clone the repository:

git clone https://github.com/itsnamrataagg/Expense-tracker.git


Navigate into project folder:

cd expense-tracker


Build the project:

mvn clean install


Run the project:

mvn spring-boot:run

🔗 API Endpoints

GET /users → Get all users

GET /users/{id} → Get user by ID

POST /users → Create a new user

PUT /users/{id} → Update user details

DELETE /users/{id} → Delete user

👩‍💻 Author

Developed by Namrata Aggarwal
