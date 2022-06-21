import java.util.Date;

/** This class is used to view the completion status of existing projects */
public class ProjectStatus extends ProjectManager {
	
	/** Method that enable users to view all completed projects */
	static void completedProjects() {
		
		/** loop through array of projects and display completed projects */
		int i;
		System.out.println("COMPLETED PROJECTS");
		for (i = 0; i < projectList.size(); i++) {
			
			/** If projectCompleted equals "Finalized", the project status is complete */
			if(projectList.get(i).projectCompleted.equals("Finalized")) 
				System.out.println(projectList.get(i).toString());
		}
	}
	
	/** Method that enable users to view all incomplete projects */
	static void incompleteProjects() { 
		
		/** Loop through projectList array to display all incomplete projects */
		System.out.println("INCOMPLETE PROJECTS");
		for (int j = 0; j < projectList.size(); j++) {
			
			/** If projectCompleted equals "No", the project status is incomplete */
			if(projectList.get(j).projectCompleted.equals("No")) 
				System.out.println(projectList.get(j).toString());
		}
	}
	
	/** Method that enable users to view all overdue projects */
	static void overdueProjects() {
		
		/** Loop through projectList array to display all overdue projects */
		System.out.println("OVERDUE PROJECTS");
		Date today = new Date(); // initialize today's date
		
		for (int i = 0; i < projectList.size(); i++) {
			
			/** If projectCompleted equals "No" and today's date succeeds the projectDeadline 
			  * OR
			  * If the completionDate succeeds the projectDeadline, the project status is overdue. */
			if(projectList.get(i).projectCompleted.equals("No") && today.after(projectList.get(i).projectDeadline)
					|| (projectList.get(i).completionDate.after(projectList.get(i).projectDeadline))) { 
				System.out.println(projectList.get(i).toString());
			}
		}
	}			
}