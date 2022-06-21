import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * This class finalizes existing projects
 */
public class FinalizeProject extends ProjectManager {
	
	/** Declare static fields */
	private static int i;
	private static Date currentDate = new Date();
	static double feeDifference;
	
	/** Method that enable users to finalize projects,
	 *  generate an invoice for the customer,
	 *  and write completed projects to a text file. */
	static void finalizeProject() {
		while (true) { 
			
			/** add try and catch block to ensure user enters a valid project number */
			try {
				/** ask user to input project number */
				System.out.println("Please enter the project number of the project you wish to finalize: ");
			    i = userInput.nextInt();
			    userInput.nextLine();
			    i = i - 1;
			     
			    /** calculate fee difference */
			    feeDifference = projectList.get(i).getTotalFee() 
			    		- projectList.get(i).getPaidAmount();
			    
			    /** if there is no outstanding fees, call the noFeeDifference() method 
			      * to finalize project and to write completed project to a text file. */
			    if (feeDifference == 0) {     
			    	noFeeDifference();
			    	return;
			    }
			    
			    /** else, if there is an outstanding fee, call the viewFeeDifference 
			      * to display the current amount owed by customer  */
			    else if (feeDifference > 0) {
			    	viewFeeDifference();
			    	return;
			    } 	    
			} catch (Exception e) {
				 System.out.println(INDEX_ERROR);
				 return; 
			}
		 }	
	}
	
	/** Method that finalizes an existing project */
	static void noFeeDifference() {
		
		/** If all fees have been paid, setProjectCompleted status to "Finalized"
		  * and setDateCompleted to currentDate */
		System.out.println("\nNo invoice is required as all outstanding fees have been paid."
    			+ "\nProject has successfully been finalized!");
    	projectList.get(i).setProjectCompleted("Finalized");
    	projectList.get(i).setDateCompleted(currentDate);	
    	
    	/** Use try and catch block to catch and handle 
    	  * a potential IOException with an external text file */
    	try {
    		/** Loop through array of projects and write 
        	 * all details of corresponding projects to a text file */
    		for (Project project: projectList) {
    			if(project.getProjectNumber()-1 == i) {
    				BufferedWriter myWriter = new BufferedWriter (new FileWriter("Completed project.txt", true));
    				myWriter.append(projectList.get(i).projectNumber + ", " + projectList.get(i).projectName 
    						+ ", " + projectList.get(i).projectType + ", "
	    					+ projectList.get(i).projectAddress + ", " + projectList.get(i).erfNumber
	    					+ ", "+ projectList.get(i).totalFee + ", "+ projectList.get(i).paidAmount
	    					+ ", " + projectList.get(i).projectDeadline + ", "
	    					+ projectList.get(i).projectCompleted + ", " + projectList.get(i).completionDate 
	    					+ ", " + projectList.get(i).customer.name + ", "
	    					+ projectList.get(i).customer.surname + ", " + 0
	    					+ projectList.get(i).customer.phoneNumber + ", "
	    					+ projectList.get(i).customer.emailAddress + ", "
	    					+ projectList.get(i).customer.physicalAddress + ", "
	    					+ projectList.get(i).architect.name + ", " + projectList.get(i).architect.surname
	    					+ ", " + 0 + projectList.get(i).architect.phoneNumber + ", "
	    					+ projectList.get(i).architect.emailAddress + ", " 
	    					+ projectList.get(i).architect.physicalAddress + ", "
	    					+ projectList.get(i).contractor.name + ", " +  projectList.get(i).contractor.surname
	    					+ ", " + 0 + projectList.get(i).contractor.phoneNumber + ", "
	    					+ projectList.get(i).contractor.emailAddress + ", "
	    					+ projectList.get(i).contractor.physicalAddress + "\n");
    			
	    	myWriter.flush();
	    	System.out.println("Succesfully wrote project details to file.");
	    	myWriter.close(); // close text file
    			}		
    		}
    	} catch (IOException e) {
			 System.out.println("File is not found. Could not write to file.");
			 return; 
		}  
	}
	
	/** Method that enables users to view outstanding balance */
	static void viewFeeDifference() {
		
		/** Display customer and invoice details containing the remaining balance owed */
		System.out.println("\nINVOICE ");
    	System.out.println(projectList.get(i).customer.toString());
		System.out.println("\nProject cannot be marked as finalized as you have an outstanding balance."
    			+ "Your current amount still payable is R " + feeDifference);			
    	System.out.println("\n");	
	}
}