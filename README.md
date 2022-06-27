# JAVA CAPSTONE PROJECT III - Object-Oriented-Programming 

# TABLE OF CONTENTS #

[Project Objectives](#Project-Objectives)

[Requirements and Installation](#Requirements-and-Installation)

[Java Packages](#Java-Packages)

[Application components](#Application-components)

[Sample output](#Sample-output)

# Project Objectives

The purpose of this project is to apply and demonstrate my developer skills, specifically using OOP, debugging, refactoring and documentation skills in Java. This Capstone Project also forms part of my developer portfolio. 

In this Capstone Project, I designed a project management system for a small structural engineering company called "Poised" which stores all relevant information
about its projects, constructors, customers and architects. 

This project management system must be able to do the following:

1. Read details about exisiting projects from a text file;
2. Capture details about new projects;
3. Update the due date of existing projects;
4. Update the contractor's contact number or email address of an existing project;
5. Update the project fee paid to date;
6. View completed, incomplete or overdue projects;
7. Finalize existing projects and write finalized projects to a text file.

# Requirements and Installation #

To run and test this code you require the following software:

__- The Java Development Kit v17 or higher:__
    - To download the JDK, click on the following: *https://www.oracle.com/java/technologies/downloads/*
    
__- Eclipse IDE:__
    - To download Eclipse, click on the following: *https://www.eclipse.org/downloads/*

# Java Packages #

  The following packages are imported into the below .java files:
   __1. Project.java packages:__
   - java.util.Date
   
   __2. ProjectManager.java packages:__
   - java.util.Scanner;
   - java.util.ArrayList;
   
   __3. ProjectCapturing.java packages:__
   - java.text.ParseException;
   - java.text.SimpleDateFormat;
   - java.util.Date
   - java.util.InputMismatchException;
   
   __4. ProjectStatus.java packages:__
   - java.util.Date
   
   __5. ProjectUpdates.java packages:__
   - java.util.Date
   - java.io.BufferedWriter;
   - java.io.FileWriter;
   - java.io.IOException;
   - java.text.ParseException;
   - java.text.SimpleDateFormat;
   
   __6. ReadProjects.java packages:__
   - java.util.ArrayList;
   - java.io.BufferedWriter;
   - java.io.FileReader;
   - java.io.IOException;
   - java.text.ParseException;
   - java.text.SimpleDateFormat;
   
   __7. FinalizeProject.java packages:__
   - java.io.BufferedWriter;
   - java.io.FileWriter;
   - java.io.IOException;
   - java.util.Date;

 
 # Application components #
   
   This application comprises 8 .java files:
   
   __1. Person.java:__
     - The Person class is used to create person objects for the customer, architect and contractor. 
     - This class will be used to store the following person attributes: __name, surname, phone number, email address and physical address.__
     - Create constructor to invoke above attribute arguments. 
     - Create __set__ methods to edit the phone number and email address of person objects. 
     - Create __toString__ method to display all attributes of the Person class. 
     
![person_class1](https://user-images.githubusercontent.com/102178512/175906540-da811b9e-8bbc-40d9-b782-23e15db9e5a4.jpg)
![person_class2](https://user-images.githubusercontent.com/102178512/175906577-6840bd71-ad10-4f92-8b89-c560180bab91.jpg)

__2. Project.java__
     - The Project class is used to create project objects
     - This class will be used to store the following information relevant to each project: __project number, project name, ERF number, project type, physical address
       of project, total fee for project, amount paid for project, project due date, project completion status and date of completion.__
     - Also add Person objects to project
     - Create constructor to invoke above attribute arguments. 
     - Create __set__ methods to edit the project name, due date, project completion status, amount paid to date and completion date. 
     - Create __toString__ method to display all attributes of the Project class.
     
    


     

     


  
  

