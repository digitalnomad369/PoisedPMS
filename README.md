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

![project_class1](https://user-images.githubusercontent.com/102178512/175906753-f8d2df4b-9846-4497-a35f-84d8885de9cb.jpg)

![project_class2](https://user-images.githubusercontent.com/102178512/175906785-1b9df84b-6839-4e11-9121-c42e05071704.jpg)

![project_class3](https://user-images.githubusercontent.com/102178512/175906827-5379538a-92e4-4a2f-93b9-eee1e648dc50.jpg)

 __3. ProjectManager.java:__
 
     - This source file is the main method of the program.
     - This program presents the user with a menu.
     - Based on the user's selection, this program uses switch(case) statements to call the 
       applicable methods from the relevant method files. 
     
  # Sample output: #
  
  ![output1_projectmanager](https://user-images.githubusercontent.com/102178512/175909927-4c805a55-ffe8-491c-bb4f-4358ca894523.jpg)
  ![output2_projectmanager](https://user-images.githubusercontent.com/102178512/175909962-d8d3d1ce-6d22-4535-a2d6-6e25ca3198d4.jpg)
  ![output3_projectmanager](https://user-images.githubusercontent.com/102178512/175910067-5e4c6835-cbfa-48d3-aa82-aeb454f25271.jpg)
  ![output4_projectmanager](https://user-images.githubusercontent.com/102178512/175910145-275fe746-bca7-44e9-b22e-1ba22527e703.jpg)
  ![output5_projectmanager](https://user-images.githubusercontent.com/102178512/175910228-9cebb2f7-12b4-478e-b8e6-6a0a87168054.jpg)
  ![output6_projectmanager](https://user-images.githubusercontent.com/102178512/175910337-31098281-b4b5-489e-aa13-37d4854d871d.jpg)
  ![output7_projectmanager](https://user-images.githubusercontent.com/102178512/175910426-120daee8-caa4-47aa-abe3-5dcbd1f501b2.jpg)

 __4. ReadProjects.java:__
 
     - This class enables a user to read details of existing projects from text files 
       and uses these details to create project objects saved to a list 
     - It also handles potential IOExceptions should no existing project objects exist in the text file. 
     
 __5. ProjectCapturing.java:__
  
    - This class uses the captureProject() method to capture details of, and create new projects and people objects of the 
      Person class.
  
  __6. ProjectUpdates.java:__
  
    - This class is used to update various project details.
    - It consists of the following static methods:  
            1. updateDueDate() and dueDateUpdate() - These methods are called when a user wants to update an existing project's 
               deadline date.
            2. updateFeePaid() and paidFeeUpdate() - These methods are called when a user wants to update the amount paid to 
               date of an existing project. 
            3. updateContractorDetails() and contractorDetailsUpdate() - These methods are called in order to update the 
               contact details (email address and phone number) of the contractor.
               
  __7. ProjectStatus.java:__
  
    - This class is used to see the project completion status of existing projects. 
    - It comprises the following 3 methods: 
             1. completedProjects() - This method is called when a user wants to view all completed projects. 
             2. incompleteProjects() - This method is called when a user wants to view all incomplete projects. 
             3. overdueProjects() - This method is called when a user wants to view all overdue projects 
                (projects that were either completed after the deadline date OR projects that have a due date prior to the current date)
                
  __8. FinalizeProject.java:__
  
    - This class is used to finalize a project or to view the outstanding project fee payable. 
    - This class consists of the following methods:
            1. finalizeProject() - If a user wishes to finalize a particular project, 
               if there is an outstanding payable fee, the viewFeeDifference() method is called and the customer
               details are shown along with the payable fee. 
               
               If there is no outstanding fee, the noFeeDifference() method is called and the setProjectCompleted() 
               method set the project to "Finalized" and all the details of the completed project is written to 
               a text file called "Completed project.txt".
               
 # Contributors #
 
 Tammy-Lee Bastian, HyperionDev
 
 tammyleebastian@gmail.com

 License and Copyright
 (c) Tammy-Lee Bastian

 Licensed under the [MIT LICENSE]


  


  


     

     


  
  

