#Spring Boot Application with Spring JPA, Spring Security, and Spring Web using H2 database
#The goal was to 
try to transform the the class diagram [see the image exercice.jpg ] into a Springboot application (Rest APIs, Security and JPA).
# This is a basic Spring Boot application that demonstrates how to use Spring JPA, Spring Security, and Spring Web to build a web application with an H2 database.

## Prerequisites
Java 8 or higher
Maven
Git
Getting Started
To get started with this project, follow these steps:

*Clone the repository:


git clone https://github.com/omardrho/SpringbootAppExample.git


*Navigate to the project directory:


cd SpringbootAppExample


*Build the project:


mvn clean install


*Run the application:


java -jar target/myapp.jar


The application will start and you can access it at http://localhost:8081.
## Features
This application includes the following features:

User registration and login using Spring Security
CRUD (Create, Read, Update, Delete) operations on a database table using Spring JPA
RESTful API endpoints to perform CRUD operations using Spring Web
H2 database for data storage
API Endpoints
The following RESTful API endpoints are available:

GET /api/users - Get a list of all users
GET /api/users/{id} - Get a user with the specified ID
POST /api/users - Create a new user
PUT /api/users/{id} - Update a user with the specified ID
DELETE /api/users/{id} - Delete a user with the specified ID


Configuration
The following configuration files are available:

application.properties - Contains the application properties, including the database configuration.
data.sql - Contains the SQL script to create the database table and insert sample data.
License
This project is licensed under the MIT License. See the LICENSE file for details.

Acknowledgments
This project was built with the help of the following resources:

Spring Boot Documentation
Spring Security Documentation
Spring Data JPA Documentation
H2 Database Documentation
