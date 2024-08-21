# Java Programs

Author - Sofiya Ansari

This Repo contains the source code for the Exercise that we have done in the ATB7x batch
- Core Java 
- OOPS
- Collections Framework
- Multi Threading
- Design Patterns
- FILE IO
- Other Misc concepts
- Exception

**OOPs, Concepts**

1. Encapsulation
2. Polymorphism
3. Super keyword
4. This keyword
5. Abstraction
6. Static Keyword


## Encapsulation
- Encapsulation is a fundamental concept in object-oriented programming (OOP).
- Bundling of **data and methods** that operate on that data within a single unit.
- Data members should be private in nature.
- Methods with getter and setter only, you can access the data members / attributes.
- Getter and Setter - help you to get or set the value via the methods only, not with the reference.
- Use Setter and Getter with Condition to secure your data members by methods
- Getter -> Fetch the data member - secure this also
- Setter - Update the value -> secure this also (based on the condition)
- Web Automation - Page Class
- API Automaton - Pojo Class
- Advantage of Encapsulation
    - **Data Hiding**
    - **Increased Flexibility**: You can make the variables of the class read-only or write-only depending on your requirements.
    - Security.


## Polymorphism
- Core principle of object-oriented programming that allows methods to perform different tasks based on the object that invokes them.
- Greek words "poly" (many) and "morphs" (forms).
## Types of Polymorphism
1. Compile-Time Polymorphism | Static Polymorphism | Method overloading
2. Runtime Polymorphism | Dynamic Polymorphism | Method overriding.


# Abstraction Concept
- In Java **Abstract is the keyword.**
- Abstraction --> **Hiding all the unnecessary details** & showing only important parts to the user.
- Remember, **abstract can be a class or method both.**
- abstract keyword -> help you to hide the functionalities.
    - abstract class , method
    - interface

- Car -> Engine, Types, brake, GearBox
- abstract can be a class or method both.`
- Showing only the essential features of an object to the user.
- hiding the inner details to reduce complexity.`
- How This implemented?
  - Abstract
  - Interface

**Concrete Class**

1. No abstract method
2. Object can be created.
3. Can be final


**Non-concrete class (abstract)**

1. Abstract methods
2. Object can't create
3. Can't be final


### **Wrapper Classes**
- A Wrapper class is a class whose object wraps or contains primitive data types.
- They convert primitive data types into objects.
- Data structures in the Collection framework, ArrayList and Vector, Hashmap - They don't primitive data type
- In API Automation, Web Automation -> avoid the primitive data type 
- When you are working with core java project which are basic in nature, 
- In Automation, we use -> Classes and Objects - wrapper classes.


Coding -  1,23,4, - even number -> primitive can be coding program

Wrapper -> they have extra functions or utilities

## Why Use Wrapper Classes?
1. Collection Framework we need to use the wrapper class.
2. Storing null values. In Wrapper Classes everything are Object -> can be null
3. Converting between primitive data types and strings:
4. Performing mathematical operations

## Exception
1. Exception : Anything which disrupt the normal flow of the program.
2. Error : We can't handle an error, If We have error -> It will halt the program -> StackOverFlow, OutOfMemory, IOError
3. How many types of exceptions there ?
  1. Checked : JVM knows -> FileNotFound, IOException
  2. Unchecked : Runtime Exceptions -> NullPointer, Arithmetic, ArrayOutofIndex
4. Throwable 
   - Exception:
      - Runtime or Unchecked : Null Pinter, Arithmetic Exception
      - Compile Time or Checked : IOException, SQLException
   - Error -> Stackoverflow
![image](https://github.com/user-attachments/assets/0f591505-5041-48b4-afd3-05f5fedab3d5)


## How to handle the exceptions?

1. Try and Catch
   - Try and Catch Block 
   - Try and Multiple Catch 
   - Try and Catch and Finally 
   - Finally ? -> Block of code which will be executed anyhow 
   - What is the purpose of finally block? -> File Closing, Scanner class closing, SQL Connect close 
     - Close of Connection -> SQL, FILE, Scanner extra.

2. Throws
   - It can also be use to handle the exception.
   - This is little different, it attaches itself to the method signature rather than the vulnerable code.


## Throws and Try-Catch

1. Both of them are used to handle the exception.
2. Try and Catch : handles only the vulnerable code. (Works with Block of Code)
3. Throws : Works with Methods 
