/** Poised Project Management System */

import java.util.ArrayList;
import java.util.Scanner;

/** This is the main class of the program
 *  <p>
 * The code in this class interacts with all other classes 
 * in this project, based on the user's unique selections. 
 * <p> 
 * It then analyzes the user's selected options and calls the methods from relevant classes.
 * <p>
 * @author Tammy-Lee Bastian
 * @version 1.0
 * @since 10-06-2022
 *
 */
public class ProjectManager {
	
	/** Create empty array to store newly captured projects */
	protected static final ArrayList<Project> projectList = new ArrayList<>();

	/** Initiate constant variables */
	public static final Scanner userInput = new Scanner(System.in);
	final static String INDEX_ERROR = "Invalid input. Project number does not exist.";
	final static String FORMAT_ERROR = "Please enter the correct integer format.";
	final static String FILE_ERROR = "Updated project details could not be written to file.";
	final static String UPDATE_ERROR = "This project has already been completed."
			+ "\nYou cannot update the details of a completed project.";
	public final static String PARSE_EXCEPTION = "A parse exception occurred.";
	final static String UPDATE = "\nUpdated project details have successfully been written to file.";
	
	/** main method of program */
	public static void main(String[] args) {
		
		/** read and view existing project details from file */
		ReadProjects.readFile();
		while (true) {
			
			/** Display Welcome screen to user
			  * Prompt user to input their option */
			System.out.println(""" 
					    \n---- Welcome to the Poised Project Management System! ----
                        \nPlease select one of the following options:\n
						1. Create a new project: 
						2. Update the due date of an existing project:
						3. Update the total fee paid to date: 
						4. Update the contractor's contact details:
						5. View completed projects:
						6. View incomplete projects:
						7. View overdue projects:
						8. Finalize an existing project: 
						9. Exit Program: """);
			
			int userChoice = userInput.nextInt();
			
			/** Use switch statements to analyze user's options */
			switch(userChoice) {
			case 1:
				ProjectCapturing.captureProject();
				break;
				
			case 2:
				ProjectUpdates.updateDueDate();
				break;
				
			case 3:
				ProjectUpdates.updateFeePaid();
				break;
				
			case 4:
				ProjectUpdates.updateContractorDetails();
				break;	
				
			case 5:
				ProjectStatus.completedProjects();
				break;
				
			case 6:
				ProjectStatus.incompleteProjects();
				break;
				
			case 7:
				ProjectStatus.overdueProjects();
				break;
				
			case 8:
				FinalizeProject.finalizeProject();
			    break;
		 	
			case 9:
			    ProjectManager exit = new ProjectManager();
			    System.out.println(exit.exitProgram());
			    break;
			    
			default:
				System.out.println("\nYou have made an invalid selection. Please try again.");
			}
			
			if(userChoice == 9) {
			    break;
			    
			} else {
			    continue;
			}		    
		}
	}
	
	/** Method that allow users to exit the program 
	 * 
	 * @return "Goodbye" and exits the program
	 */
	public String exitProgram()	{
		return "Goodbye!";
	}		
}
/** Program Ends */