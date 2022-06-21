import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

/** This class captures details of, and creates new projects */
public class ProjectCapturing extends ProjectManager {
	
	/** Method that captures details for new projects */
	static void captureProject() {
		while (true) {
			
			/** add try and catch block to ensure user
			  * enters the correct integer format where requested */
			try {
				/** Enter project number */
				System.out.println("PROJECT DETAILS");
				System.out.println("Please enter the project number: ");
				int projectNum = userInput.nextInt();
					
				/** Enter name of the project */
				System.out.println("Please enter the name of the project: ");
				String projectName = userInput.nextLine();
				userInput.nextLine();
				
				/** Enter the project type (house, apartment, etc) */
				System.out.println("Please enter the project type: ");
				String projectType = userInput.next();
				userInput.nextLine();
						
				/** Enter the physical address of the project */
				System.out.println("Please enter the physical address of the project: ");
				String projectAddress = userInput.nextLine();
					
				/** Enter the ERF number */
				System.out.println("Please enter the ERF number: ");
				int erfNumber = userInput.nextInt();
					
				/** Enter the total fee payable */
				System.out.println("Please enter the total fee for the project: ");
				double totalFee = userInput.nextDouble();
				
				/** Enter the amount paid to date */
				System.out.println("Please enter the amount paid to date: ");
				double paidAmount = userInput.nextDouble();
				
				/** Enter deadline date and convert from string to date format */
				System.out.println("Please enter the deadline date for the project in the following format - "
				 			+ "(yyyy-MM-DD): ");
				String projectDeadline = userInput.next();
				SimpleDateFormat deadlineDate = new SimpleDateFormat("yyyy-MM-dd");
				Date projDeadline = deadlineDate.parse(projectDeadline);
				
				/** CAPTURE CUSTOMER DETAILS */
				System.out.println("\nCustomer Details");
				System.out.println("Please enter the customer's name: ");
				String customerFirstName = userInput.next();
				userInput.nextLine();

				System.out.println("Please enter the customer's last name: ");
				String customerSurname = userInput.next();
				userInput.nextLine();
			
				System.out.println("Please enter the customer's contact number(number must be 10 digits): ");
				int customerPhoneNum = userInput.nextInt();
				 	
				System.out.println("Please enter the customer's email address: ");
				String customerEmail = userInput.next();
				userInput.nextLine();

				System.out.println("Please enter the customer's residential address: ");
				String customerPhysicalAddress = userInput.nextLine();
				 	
				/** create customer object */
				Person customer = new Person(customerFirstName, customerSurname,
						customerPhoneNum, customerEmail, customerPhysicalAddress);
				
				/** CAPTURE ARCHITECT DETAILS */
				System.out.println("\nArchitect Details");
				System.out.println("\nPlease enter the architect's name: ");
				String architectFirstName = userInput.next();
				userInput.nextLine();
				
				System.out.println("Please enter the architect's last name: ");
				String architectSurname = userInput.next();
				userInput.nextLine();

				System.out.println("Please enter the architect's contact number(number must be 10 digits): ");
				int architectPhoneNum = userInput.nextInt();
				 	
				System.out.println("Please enter the architect's email address: ");
				String architectEmail = userInput.next();
				userInput.nextLine();
				 	
				System.out.println("Please enter the architect's residential address: ");
				String architectPhysicalAddress = userInput.nextLine();
				 	
				/** create architect object */
				Person architect = new Person(architectFirstName, architectSurname, 
						architectPhoneNum, architectEmail, architectPhysicalAddress);
				
				/** CAPTURE CONTRACTOR DETAILS */
				System.out.println("\nContractor Details");
				System.out.println("\nPlease enter the contractor's name: ");
				String contractorFirstName = userInput.next();
				userInput.nextLine();
				 	
				System.out.println("Please enter the contractor's last name: ");
				String contractorSurname = userInput.next();
				userInput.nextLine();
				 	
				System.out.println("Please enter the contractor's contact number(number must be 10 digits): ");
				int contractorPhoneNum = userInput.nextInt();
				 	
				System.out.println("Please enter the contractor's email address: ");
				String contractorEmail = userInput.next();
				userInput.nextLine();
				 	
				System.out.println("Please enter the contractor's residential address: ");
				String contractorPhysicalAddress = userInput.nextLine();
				 	
				/** create contractor object */
				Person contractor = new Person(contractorFirstName, contractorSurname, 
						contractorPhoneNum, contractorEmail, contractorPhysicalAddress);
				 	
				String projCompleted = "No";
				Date dateOfCompletion = null;
				
				/** Create new project using above captured details */
				Project newProj = new Project(projectNum, projectName, projectType, projectAddress, 
						erfNumber, totalFee, paidAmount, projDeadline, projCompleted, dateOfCompletion,
				 		customer, architect, contractor);
				
				/** if project name is empty, 
				 *  set project name equal to projectType + customerSurname
				 */
				if (projectName.equals("")) {
					newProj.setProjectName(projectType + " " + customerSurname);
				}	 	
				
				/** add project object to projectList */
				projectList.add(newProj);
				 	
				/** Display captured project and person details */
				System.out.print("\nNew project has been successfully created!");
				System.out.print(newProj.toString());
				System.out.print("\nCustomer details:\n " + customer.toString());  
				System.out.print("\nArchitect details:\n " + architect.toString());
				System.out.print("\nContractor details:\n " + contractor.toString());
				break;
				 	
	    	} catch (InputMismatchException e) {
	    		System.out.println(FORMAT_ERROR);
	    		userInput.nextLine();
	    	} catch (ParseException e) {
	    		System.out.println(PARSE_EXCEPTION);
	    		userInput.nextLine();
	    	}
	    }
	}
}