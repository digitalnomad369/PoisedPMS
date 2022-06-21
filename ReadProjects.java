import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Date;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/** This class enables a user to read details of existing projects from text files 
  * and uses these details to create project objects saved to a list */
public class ReadProjects extends ProjectManager {
	
	/** Create empty constant array to store completed projects from external file */
	private static final ArrayList<Project> tempProjectList = new ArrayList<>();
	
	/** Method that reads details about existing projects
	 * from text file and uses these details to create project lists */
	static void readFile() {
		
		/** Use try and catch block to catch and handle potential IOExceptions, 
		  * ParseExceptions and general Exceptions */
		try (BufferedReader existingProjects = new BufferedReader(new FileReader("Completed project.txt"))) {
			while(existingProjects.ready()) {
				
				/** Creating a temporary array to convert items 
				 * in text file from string to relevant data types */
				String [] temp = existingProjects.readLine().split(", ");
				Person customer = new Person(temp[10], temp[11], Integer.parseInt(temp[12]), temp[13], temp[14]);
	            Person architect = new Person(temp[15], temp[16], Integer.parseInt(temp[17]), temp[18], temp[19]);
	            Person contractor = new Person(temp[20], temp[21], Integer.parseInt(temp[22]), temp[23], temp[24]);
	            
	            /** Format strings to date format */
	            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy");
	            Date deadlineDate = (Date) dateFormat.parseObject(temp[7]);
	            Date completionDate = (Date) dateFormat.parseObject(temp[9]);
	            
	            /** Create tempProject using existing project details */
	            Project tempProject = new Project(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3],
	                       Integer.parseInt(temp[4]), Double.parseDouble(temp[5]), Double.parseDouble(temp[6]), 
	                       deadlineDate, temp[8], completionDate, customer, architect, contractor);
	            
	            /** add tempProject to tempProjectList array */
	            tempProjectList.add(tempProject);
	            System.out.println(tempProject.toString()); /** display existing project details */
			}
	     } catch (IOException e) {
	    	 System.out.println("No file is found in directory. No file content to create project list.");
	     }  catch (ParseException e) {
	         System.out.println(PARSE_EXCEPTION);
	     } catch (Exception e) {
	         System.out.println("An error occured.");
	     }
	}
}