# Todo Application

A Java-based Todo application with a Swing-based user interface and MySQL database integration. This application allows users to manage their tasks with basic CRUD operations.

## Features

- Create, Read, Update, and Delete todo items
- Track task completion status
- Store task details including title and description
- Automatic timestamps for task creation and updates
- MySQL database integration for persistent storage

## Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher
- MySQL Server 8.0 or higher

## Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd todo-application
   ```

2. **Set up the database**
   - Create a new MySQL database
   - Update the database configuration in `src/main/resources/application.properties`
   
   Example database schema:
   ```sql
   CREATE DATABASE todo_db;
   USE todo_db;
   
   CREATE TABLE todos (
       id INT AUTO_INCREMENT PRIMARY KEY,
       title VARCHAR(255) NOT NULL,
       description TEXT,
       completed BOOLEAN DEFAULT FALSE,
       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
       updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
   );
   ```

3. **Build the application**
   ```bash
   mvn clean package
   ```

## Running the Application

### Using Maven
```bash
mvn exec:java
```

### Using the executable JAR
After building, run:
```bash
java -jar target/todo-application-1.0.0.jar
```

## Project Structure

```
src/
  main/
    java/
      com/todo/
        Main.java            # Application entry point
        model/
          Todo.java          # Todo entity class
pom.xml                     # Maven configuration
```

## Dependencies

- MySQL Connector/J 8.0.33
- Java 11+

## Building from Source

1. Ensure you have Java 11+ and Maven installed
2. Clone the repository
3. Run `mvn clean package`
4. The executable JAR will be available in the `target` directory

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Future Enhancements

- User authentication
- Task categories and tags
- Due dates and reminders
- Task prioritization
- Export/Import functionality
