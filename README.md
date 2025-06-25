# Student Management Console App

This is a simple Java console-based application that allows users to **Add**, **View**, **Update**, **Delete**, and **Display** student records using an `ArrayList`. It utilizes basic object-oriented programming concepts, control structures, and user input via `Scanner`.

## Features

- Add one or more students with ID, name, and marks
- Delete a student by ID
- View a student's information by ID
- Update a student's name and marks by ID
- Display all stored students
- Menu-driven interface with user-friendly prompts

## Getting Started

### Prerequisites

- JDK 8 or higher installed
- A text editor or IDE (e.g., IntelliJ IDEA, VS Code)
- Terminal or Command Prompt

### How to Compile and Run

1. Save the code in a file named `StudentList.java`.

2. Open a terminal in the directory containing the file.

3. Compile the program:

```bash
javac StudentList.java
```

4. Run the compiled class:

```bash
java StudentList
```

## Example Commands

Once the program is running, type any of the following commands to interact:

- `add` - Add one or more new students
- `delete` - Delete a student using their ID
- `view` - View details of a specific student by ID
- `update` - Update the name and marks of a student
- `display` - Show all students currently in the list
- `exit` - Terminate the program

## Sample Output

```
Choose an action: add, delete, view, update, display, exit
add
Enter student ID: 101
Enter student name: Alice
Enter student marks: 85.5
Do you want to add another student? (yes/no): no

Choose an action: display
All Student Details:
ID: 101, Name: Alice, Marks: 85.5
```

## Code Structure

- `StudentAdd` class: Represents individual student data.
- `StudentList` class: Main class with the menu loop and student list operations.

## Notes

- Student ID is used as a unique identifier for operations.
- Input validation is minimal, so be careful with data entry (e.g., entering strings for numeric fields will cause exceptions).
- The data is stored in memory and will not persist after the program ends.

## Author

This project was created as part of a basic Java practice exercise. Suitable for beginners learning about:
- Java classes and objects
- Collections (`ArrayList`)
- Control flow
- User input handling