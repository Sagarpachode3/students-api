# Students-API

The StudentManagerAPI is a Spring Boot application that provides a RESTful API for managing student information. It supports basic CRUD operations (Create, Read, Update, Delete) for a `students` table in a database. 
The application is built using Spring Boot, Spring Data JPA, and MySQL Database for simplicity. 
The `Student` entity includes fields such as `firstName`, `lastName`, `gender`, `courseOpted`, and `age`.

## Endpoints

- **GET /api/students/:** Retrieve all students.
- **GET /api/students/{StudentId}:** Retrieve a specific student by ID.
- **POST /api/students/:** Create a new student.
- **POST /api/students/{StudentId}:** Update an existing student.
- **DELETE /api/students/{StudentId}:** Delete a student by ID.

## Usage

1. Clone the repository.
2. Configure the database settings in `application.properties`.
3. Run the Spring Boot application.
4. Use tools like Postman or curl to interact with the API.

## Note

- Ensure that the appropriate dependencies are installed (Spring Web, Spring Data JPA, etc.).
- Customize the API as needed for your specific project requirements.

**Feel free to adjust the description based on any additional features, configurations, or specifics of your application.**
