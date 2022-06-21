import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * This class comprises methods used to update various project details.
 */
public class ProjectUpdates extends ProjectManager {
	
	/** Declare static integer fields accessible to all class methods */
	private static int deadlineIndexNum;
	private static int paidAmountIndex;
	private static int contractorIndexNum;
	final static String TEXT_FILE = "Updated project details.txt";
	final static String COMPLETED = "Finalized";
	
	/** Method that enable users to update the due date of existing projects */
	static void updateDueDate()  {
		while (true) {
			
			/** add try and catch block to ensure user inputs a valid project number. */
			try {
				/** ask user to input a project number */
				System.out.println("Please enter the project number " 
						+ "of the project's deadline you wish to change:");
				deadlineIndexNum = userInput.nextInt();
				userInput.nextLine();
				deadlineIndexNum = deadlineIndexNum - 1;
				
				/** If projectCompleted equals "Finalized",
				  * print relevant update error message */
				if(projectList.get(deadlineIndexNum).projectCompleted.equals(COMPLETED)) {
					System.out.println(UPDATE_ERROR);
					return;
				}
				/** Else if projectCompleted equals "No",
				  * call dueDateUpdate() method to update the project's due date */
				else if (projectList.get(deadlineIndexNum).projectCompleted.equals("No")) {
					dueDateUpdate();
					return;
				}
				
			/** Repeatedly ask user to enter a valid project number */
			} catch (Exception e) {
				System.out.println(INDEX_ERROR); 
				userInput.nextLine();
				return;
			}
		}
	}
	
	/** Method that updates the due date of an incomplete project */
	static void dueDateUpdate() {
		
		/* Use a try and catch block to handle potential
		 * user input exceptions, IO- and ParseExceptions */
		try {
			/** enter new deadline date and convert user input to Date format */
			System.out.print("Please enter the new due date in the following format (yyyy-MM-dd): ");
			String newDueDate = userInput.nextLine();
			SimpleDateFormat dueDate = new SimpleDateFormat("yyyy-MM-dd");
			Date updatedDueDate = dueDate.parse(newDueDate);
					
			/** call setDeadline() method to reset value of updated project due date */
			projectList.get(deadlineIndexNum).setDeadline(updatedDueDate);
			
			/** Loop through projectList array
			  * to write relevant project's 
			  * updated due date to a text file  */
			for(Project project: projectList) {
				if(project.getProjectNumber()-1 == deadlineIndexNum) {
					FileWriter myWriter = new FileWriter(TEXT_FILE, true);
					myWriter.append("\n* " +  projectList.get(deadlineIndexNum).projectNumber
							+ "* " + projectList.get(deadlineIndexNum).projectDeadline);
					
			/** Display updated project details */
			System.out.print(projectList.get(deadlineIndexNum).toString());
			myWriter.flush();
			System.out.println(UPDATE);
			myWriter.close(); // close text file
				}
			}
		} catch (ParseException e) {
			System.out.println(PARSE_EXCEPTION);
			return;
		} catch (IOException e) {
			System.out.println(FILE_ERROR);
			return;
		} catch (Exception e) {
			System.out.println(FORMAT_ERROR);
			return;
		} 
	}
	
	/** Method that enable users to update the amount paid */
	static void updateFeePaid() {
		while (true) {
			
			/** add try and catch block to ensure 
			  * user enters a valid project number. */
			try {
				/** ask user to input a project number */
				System.out.print("Please enter the project number for which to update paid amount: ");
				paidAmountIndex = userInput.nextInt();
				paidAmountIndex  = paidAmountIndex - 1;
				
				/** If projectCompleted equals "Finalized",
				  * print relevant update error message */
				if(projectList.get(paidAmountIndex).projectCompleted.equals(COMPLETED)) {
					System.out.println(UPDATE_ERROR);
				    return;
				}
				
				/** Else if projectCompleted equals "No",
				  * call paidFeeUpdate() method to update the paid amount to date */
				else if (projectList.get(paidAmountIndex).projectCompleted.equals("No")) {
					paidFeeUpdate();
				    return;			      
				}
			} catch (Exception e) {
				System.out.println(INDEX_ERROR);
				userInput.nextLine();
				return;
			} 
		}
	}
	
	/** Method that updates the paid amount of incomplete projects */
	static void paidFeeUpdate () {
		
		/** Use try and catch blocks to handle
		  * potential Exceptions, including IOExceptions */
		try {
			/** ask user to input the updated paid amount */
			System.out.print("Please enter the updated amount paid to date: ");
		    double updatedPaidAmount = userInput.nextDouble();
		    userInput.nextLine();
	    
		    /** call the setPaidAmount() method to update the paid amount */
		    projectList.get(paidAmountIndex).setPaidAmount(updatedPaidAmount);
		    
		    /** Loop through projectList array to write relevant project's 
			  * updated fee paid to a text file */
		    for(Project project: projectList) {
	    		if(project.getProjectNumber()-1 == paidAmountIndex) {
	    			BufferedWriter myWriter = new BufferedWriter(new FileWriter(TEXT_FILE, true));
	    			myWriter.append("\n* " + projectList.get(paidAmountIndex).projectNumber 
	    					+ "* "+ projectList.get(paidAmountIndex).paidAmount);
	    			
	    	/** Display updated project details */
		    System.out.println(projectList.get(paidAmountIndex).toString());
		    myWriter.flush();
	    	System.out.println(UPDATE);
	    	myWriter.close(); // close text file
	    		}	
		    } 
		
		} catch (IOException e) {
			System.out.println(FILE_ERROR);
			return;
		} catch (Exception e) {
			System.out.println(FORMAT_ERROR);
			userInput.nextLine();
			return;
		}
	}
	
	/** Method that enable users to update the contractor's details */
	static void updateContractorDetails() {
		while (true) {
			
			/** add try and catch block to ensure 
			  * user inputs a valid project number in projectList */
			try {
				/** user is asked to enter a project number */
				System.out.print("Please enter the project number "
						+ "for which to update the contractor's details: ");
				contractorIndexNum = userInput.nextInt();
				userInput.nextLine();
				contractorIndexNum = contractorIndexNum - 1;
				
				/** If projectCompleted equals "Finalized",
				  * print relevant update error message */
				if(projectList.get(contractorIndexNum).projectCompleted.equals(COMPLETED)) {
					System.out.println(UPDATE_ERROR);
					return;
				} 
				
				/** Else if projectCompleted equals "No", call contractorDetailsUpdate() method
				  * to update the contractor's contact details */
				else if (projectList.get(contractorIndexNum).projectCompleted.equals("No")) {
					contractorDetailsUpdate();
					return;
				}

			} catch (Exception e) {
				System.out.println(INDEX_ERROR); 
				userInput.nextLine();
				return;
			} 
		}
	}
	
	static void contractorDetailsUpdate() {
		
		/** Use try and catch blocks to handle
		 * potential Exceptions, including IOExceptions */
		try {
			/** ask user to input the contractor's updated contact number */
			System.out.print("Please enter the updated contact number for the contractor "
					+ "(number must be 10 digits): ");
			int updatedPhoneNo = userInput.nextInt();
		
			/** Reset value of contractor's phone number */
			projectList.get(contractorIndexNum).contractor.setPhoneNumber(updatedPhoneNo);
			
			/** ask user to input the contractor's updated email address */
			System.out.println("Please enter the contractor's updated email address: ");
			String updatedEmailAddress = userInput.next();
			userInput.nextLine();
		
			/** Reset value of contractor's email address */
			projectList.get(contractorIndexNum).contractor.setEmailAddress(updatedEmailAddress);
			
			/** Loop through projectList array to write contractor's
			  * updated contact details, relevant to project, to a text file */
			for(Project project: projectList) {
				if(project.getProjectNumber()-1 == contractorIndexNum) {
					BufferedWriter myWriter = new BufferedWriter(new FileWriter(TEXT_FILE, true));
	    			myWriter.append("\n* " + projectList.get(contractorIndexNum).projectNumber + "* "
	    					+ 0 + projectList.get(contractorIndexNum).contractor.phoneNumber
	    					+ "* "+ projectList.get(contractorIndexNum).contractor.emailAddress);
	  			
	    	/** Display contractor's updated details */
	    	System.out.println(projectList.get(contractorIndexNum).contractor.toString());

		    myWriter.flush();
	    	System.out.println(UPDATE);
	    	myWriter.close(); /** close text file */
	    		}	
			}
		} catch (IOException e) {
			System.out.println(FILE_ERROR);
			return;
		} catch (Exception e) {
			System.out.println(FORMAT_ERROR);
			userInput.nextLine();
			return;
		}
	}
}