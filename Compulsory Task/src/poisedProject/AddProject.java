package poisedProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

//This class will collect the full information of the project and add it to a text file.
public class AddProject {

	public static void addProject() {
		
		try {
			
			//Messages to explain to the user exactly what's happening and what,s expected of them.
			System.out.println("\nYou have selected to Add a Project!");
			System.out.println("\nPlease correctly input the following information and once complete it will be added to the Projects text file.");
			
			//Scanner object
			Scanner proInput = new Scanner(System.in);
			
			//Getting the project information from user
			
			System.out.println("\nPlease input the project number:");
			String projectNum = proInput.nextLine();
			System.out.println("\nPlease input the project name:");
			String projectName = proInput.nextLine();
			System.out.println("\nPlease input the building type:");
			String type = proInput.nextLine();
			System.out.println("\nPlease input the ERF number:");
			String erfNum = proInput.nextLine();
			System.out.println("\nPlease input the Address of the project:");
			String projectAddress = proInput.nextLine();
			System.out.println("\nPlease input the total fee due:");
			String totalFee = proInput.nextLine();
			System.out.println("\nPlease input the total paid by client:");
			String totalPaid = proInput.nextLine();
			System.out.println("\nPlease input the project deadline in dd/mm/yyyy format:");
			String projectDeadline = proInput.nextLine();
			
			//Getting Architects details
			System.out.println("\nPlease input the Architects Name:");
			String architectName = proInput.nextLine();
			System.out.println("\nPlease input the Architects Telephone number:");
			String architectTelNum = proInput.nextLine();
			System.out.println("\nPlease input the Architects Email:");
			String architectEmail = proInput.nextLine();
			System.out.println("\nPlease input the Architects Address:");
			String architectAddress = proInput.nextLine();
			
			//Getting Contractors details
			System.out.println("\nPlease input the Contractors Name:");
			String contractorName = proInput.nextLine();
			System.out.println("\nPlease input the Contractors Telephone number:");
			String contractorTelNum = proInput.nextLine();
			System.out.println("\nPlease input the Contractors Email:");
			String contractorEmail = proInput.nextLine();
			System.out.println("\nPlease input the Contractors Address:");
			String contractorAddress = proInput.nextLine();
			
			//Getting Customers details
			System.out.println("\nPlease input the Customers Name:");
			String customerName = proInput.nextLine();
			System.out.println("\nPlease input the Customers Telephone number:");
			String customerTelNum = proInput.nextLine();
			System.out.println("\nPlease input the Customers Email:");
			String customerEmail = proInput.nextLine();
			System.out.println("\nPlease input the Customers Address:");
			String customerAddress = proInput.nextLine();
			
			proInput.close();
			
			//If the user has not input a project name the program must take the surname of the customer and the building type to make a name
			if (projectName.length() == 0 ){
				String[] tempName = customerName.split(" ");
				projectName = type + " " + tempName[1];
			}
			
			else {
			}
			
			//Project Info Objects
			ProjectInfo details = new ProjectInfo(projectNum, projectName, type, projectAddress, erfNum, 
									totalFee, totalPaid, projectDeadline);
			
			//Person Objects
			Person people = new Person(architectName, architectTelNum, architectEmail, architectAddress, contractorName, 
							contractorTelNum, contractorEmail, contractorAddress, customerName, 
							customerTelNum, customerEmail, customerAddress);
					
			//Add to file
			String text = "";
			try {
				
				//Now we will open the Projects text file to read through existing text.
				File projects = new File("Projects.txt");
				
				//I then Scan through the existing text and add it to the text variable.
				Scanner readText = new Scanner(projects);
				while(readText.hasNextLine()) {
					text = text.concat(readText.nextLine() + "\n");
				}
				
				//Create a File Writer
				try {
					
					FileWriter fw = new FileWriter(projects);
					PrintWriter pw = new PrintWriter(fw);
					
					//I then add our new project to the existing projects
					
					pw.write(text + details.toString() + people.toString());
					
					pw.close();
					readText.close();
				} 
				
				catch (IOException e) {
					
					System.out.println("Error! File Not Found!");
					AddProject.addProject();
				}
				
			}
			
			catch(IOException e) {
				System.out.println("Error! Projects text file not found!");
			}
			
			System.out.println("You have successfully added a new project!");
			
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("You have given an invalid input.");
			AddProject.addProject();
		}
		
	}
	
}
