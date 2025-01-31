# Dolphins Swim Academy API

## Project Description
This is a REST API for managing a swim academy's class sessions and student registrations. The application handles class schedules, student enrollment, and session management.

## Features
- Get all classes in a session (including class details and student count)
- Get specific class details by ID (including enrolled students)
- Create new classes
- Add students to classes
- REST API design following standard conventions
- Automated testing suite using Postman

## API Endpoints

### Classes
- `GET /api/classes` - Get all classes in a session
  - Returns: id, session, time, level, and number of students
- `GET /api/classes/{id}` - Get a specific class by ID
  - Returns: class details and enrolled students (id, name, age)
- `POST /api/classes` - Create a new class
- `POST /api/classes/{id}/students` - Add a student to a class

## Technical Features
- ClassApiController implementation for REST endpoints
- JavaScript enhancements:
  - Time slot conflict prevention in registration
  - Automatic form submission on session selection
  - Visual indication of enrolled students using color coding
- AJAX implementation for real-time student enrollment status

## Testing
- Comprehensive Postman test suite included
- Both positive and negative test cases
- Tests cover error scenarios like:
  - Resource not found
  - Missing required fields
  - Duplicate student enrollment

## Technologies Used
- Backend: Java
- Template Engine: JTE (Java Template Engine)
- Frontend: JavaScript, AJAX
- Testing: Postman
- Architecture: REST API
