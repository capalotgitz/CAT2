# CAT2_OOP
# Java OOP Concepts Demo

A clean demonstration of core Object-Oriented Programming principles in Java.
## Key Concepts

 Concept , Implementation Example , Key Feature  
 **Abstraction** ,`Appliance` abstract class , Defines `turnOn()` without implementation 
 **Encapsulation** , `Student` class , Private fields with validated setters 
 **Polymorphism** ,`MathOperations` (overloading)<br>`Animal/Dog/Cat` (overriding),  Multiple forms of same operation 
 **Exception Handling**, Try-catch in main class | Graceful error recovery |

## Code Structure

```text
Main.java
├── AbstractionException (main class)
├── Appliance (abstract)
├── Fan/TV (concrete implementations)
├── Student (encapsulation)
├── MathOperations (overloading)
└── Animal/Dog/Cat (inheritance+overriding)
```

## How to Run

1. Compile:
```bash
javac Main.java
```

2. Execute:
```bash
java AbstractionException
```

## What You'll See

- Appliance abstraction in action (Fan/TV turning on)
- Student grade validation
- Polymorphic method calls
- Division with error handlinG
- 
## Why This Matters
✔ Illustrates OOP fundamentals clearly  
✔ Shows practical Java implementation  

**Extension Ideas**:
- Create custom exceptions
- Implement interfaces
- Add unit tests
```
**Save the file**:
   - Make sure to save it with the `.md` extension (not `.txt`)
   - Most code editors will recognize this as Markdown format
**Viewing the README**:
   - On GitHub/GitLab: It will automatically render with nice formatting
   - Locally: Use a Markdown viewer or open in VS Code with preview (Ctrl+Shift+V)

 **What it will look like**:
   - The rendered version will show:
     - A Java version badge
     - Clean tables for concepts
     - Proper code formatting
     - Clear section headers
     - Bullet points and checkmarks
