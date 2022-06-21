import java.util.Date;

/** The Project class is used to define and create project objects */
public class Project {
	
	/** Create and define attributes of Project class */
	int projectNumber;
	String projectName;
	String projectType;
	String projectAddress;
	int erfNumber;
	double totalFee;
	double paidAmount;
	Date projectDeadline;
	String projectCompleted;
	Date completionDate;
	
	/** Adding Person objects to project */
	Person customer;
	Person architect;
	Person contractor;
	
	/** The below constructor is used to invoke the arguments 
	  * initialized above.*/
	public Project(int projectNumber, String projectName, String projectType,
	String projectAddress, int erfNumber, double totalFee, double paidAmount, Date projectDeadline, 
	String projectCompleted, Date completionDate, Person customer, Person architect, Person contractor) {
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.projectType = projectType;
		this.projectAddress = projectAddress;
		this.erfNumber = erfNumber;
		this.setTotalFee(totalFee);
		this.paidAmount = paidAmount;
		this.projectDeadline = projectDeadline;
		this.projectCompleted = projectCompleted;
		this.completionDate = completionDate;
		this.customer = customer;
		this.architect = architect;
		this.contractor = contractor;
	}
	
	/** Class Methods
	 * <p>
	 * Create getters and setters to access
	 * or edit specific Project attributes. */ 
	
	public int getProjectNumber() {
		return projectNumber;
	}
	
	public void setProjectName(String projectName) {
	       this.projectName = projectName;
	}    
	
	public void setDeadline (Date projectDeadline) {
		this.projectDeadline = projectDeadline;
	}
		
	public double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	
	public double getPaidAmount() {
		return paidAmount;
	}
	
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	public void setProjectCompleted(String projectCompleted){
		this.projectCompleted = projectCompleted;
	}
	
	public void setDateCompleted(Date completionDate) {
		this.completionDate = completionDate;
	}
	
	/** Create toString() method to display attributes of Project class */
	public String toString() {
		String output = "\nProject number: " + projectNumber;
		output += "\nProject name: " + projectName;
		output += "\nProject type: " + projectType;
		output += "\nPhysical address of project: " + projectAddress;
		output += "\nERF number: " + erfNumber;
		output += "\nTotal fee payable: " + getTotalFee();
		output += "\nFee paid to date: " + paidAmount;
		output += "\nProject due date: " + projectDeadline;
		output += "\nProject completed? " + projectCompleted;
		output += "\nCompletion date: " + completionDate + "\n";
		
		return output;
	}
}