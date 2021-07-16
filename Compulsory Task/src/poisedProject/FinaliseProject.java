package poisedProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//This class will handle the finalizing of projects and moving of them to the completed tasks file
public class FinaliseProject {

	//Declaring variables for the entire class
	public static String[] projectTextArray;
	public static ArrayList<String> finalProjectTextArray;
	public static String[] selectedProject;
	public static String[] trashArray;
	public static int itemNum;
	
	public static void finaliseProject() {
		
		/*In this class the user will be finalizing a project. The user will select a project using the name or number. 
		 * The project text will be added to a variable and the selected project will be extracted. The Project text will
		 * be added back to the text file and the selected project will be added to the completed projects text file.*/
		
		try {
			
			//Ask the user to choose which search item they which to search with.
			//Menu
			System.out.println("\nYou have chosen to finalise a project.");
			System.out.println("\nPlease select corresponding number of which item you will be searching with: \n" +
					"Project Number - 1\n" +
					"Project Name - 2\n" +
					"Back to menu - 3\n" +
					"End program - 0\n");
			
			//Get the users selection
			Scanner userChoice = new Scanner(System.in);
			int choice = userChoice.nextInt();
			
			//Declaring variables for use in the Method
			String projectText = "";
			int index = 0;
			itemNum = 0;
			
			//Using the project number
			if (choice == 1) {
				
				try {
					
					//User Input
					Scanner proNum = new Scanner(System.in);
					System.out.println("\nWhat is the Project Number?");
					String searchItem = "Project Number: " + proNum.nextLine();
					
					//Opening the file
					File projects = new File("Projects.txt");
					
					//Try-catch for the scanner object
					try {
						
						//Creating scanner object
						Scanner x = new Scanner(projects);
						
						//While Loop
						while(x.hasNextLine()) {
							
							//We scan the lines into the Line variable
							String line = x.nextLine();
							//Increase the index by 1 after adding to line
							index++;
							
							//If the search item is in the line variable
							if (line.contains(searchItem)) {
								
								//I add the index into the itemNum variable and this will be used later to find the selected project.
								itemNum = index;
							}
						}
					}
					
					//If the file is not found this will catch the error
					catch (FileNotFoundException e) {
						
						//File not found message will appear and the user will be taken back to the menu
						System.out.println("Error! File Not Found!");
						EditProject.editProject();
						
					}
					
					//Try-catch for the x scanner just in case the file is not found
					try {
						
						//Creating scanner object
						Scanner x = new Scanner(projects);
						
						//Declaring variables
						String line = "";
						
						//While x has next line the loop will run.
						//While Loop
						while(x.hasNextLine()){
							
							//The String variable line will store lines from the text file
							line = line + x.nextLine() + "\n";
						}
						
						//The line variable will be added to the projectText variable.
						projectText += line;
					}
					
					//If the file is not found this will catch the error
					catch (FileNotFoundException e) {
							
						//File not found message will appear and the user will be taken back to the menu
						System.out.println("Error! File Not Found!");
						EditProject.editProject();
					}
				    
					//Declaring variables
					projectTextArray = projectText.split("\n");
					int index2 = 0;
					selectedProject = new String[20];
					
					//For i in range of the itemNum minus one to 19 this will loop. This is because we know the project selected is a total of 20 items
					for(int i = itemNum - 1; i < i + 19; i++) {
						
						//The item from index i in projectTextArray will be assigned to the index2 value in the selectedProject Array
						selectedProject[index2] = projectTextArray[i];
						//index2 will increase by 1 after the value has been assigned
						index2++;
						
						//If index2 equals 20 the loop will break because it will be out of range
						if (index2 == 20) {
							
							break;
						}
					}
					
					finalProjectTextArray = new ArrayList();
					
					for(int i = 0; i < projectTextArray.length; i++) {
						
						finalProjectTextArray.add(projectTextArray[i]);
						
					}
					
					for(int i = 0; i < 20; i++) {
						
						finalProjectTextArray.remove(selectedProject[i]);
					}
					
					String projectTextString = finalProjectTextArray.toString();
					projectTextString = projectTextString.replace("[", "");
					projectTextString = projectTextString.replace("]", "");
					projectTextString = projectTextString.replace(", ", "\n");
					
					//Opening the projects file again to write in it
					File projects2 = new File("Projects.txt");
					
					//Try-catch for the file writer
					try {
						
						//File and Print Writer objects
						FileWriter fw = new FileWriter(projects2);
						PrintWriter pw = new PrintWriter(fw);
						
						//Write the String into the projects text file
						pw.write(projectTextString);
					
						//Close the Print Writer
						pw.close();
					}
					
					catch(IOException e) {
						
						//Error message shall be displayed and user will be taken back to the menu
						System.out.println("Error! File Not Found!");
						FinaliseProject.finaliseProject();
					}
					
					//Make a String object for the Completed Projects text file
					String finalisedProjectsText = "";
					//Putting the selected project into a String in the correct format
					String selectedProjectString = "\n" + Arrays.toString(selectedProject);
					selectedProjectString = selectedProjectString.replace("[", "");
					selectedProjectString = selectedProjectString.replace("]", "");
					selectedProjectString = selectedProjectString.replace(", ", "\n");
					
					//Open the Completed Projects text file
					File completedTasks = new File("Completed Projects.txt");
					
					//Try-catch for the scanner x
					try {
						
						//Make Scanner object
						Scanner x = new Scanner(completedTasks);
						
						//Scan through all the lines and add it to the String object
						while(x.hasNextLine()) {
							
							finalisedProjectsText += x.nextLine() + "\n";
						}
					}
					
					catch (FileNotFoundException e) {
						
						//Error message shall be displayed and user will be taken back to the menu
						System.out.println("Error! File Not Found!");
						FinaliseProject.finaliseProject();
					}
					
					try {
						
						Scanner userDate = new Scanner(System.in);
						System.out.println("\nPlease insert the date the project was completed:");
						String completionDate = "Completion Date: " + userDate.nextLine();
						
						//Try-catch for the File Writer
						try {
							
							//Make File and Print Writer objects
							FileWriter fw = new FileWriter(completedTasks);
							PrintWriter pw = new PrintWriter(fw);
							
							//Write the old text and add the new text into the text file
							pw.write(finalisedProjectsText + selectedProjectString + "\n" + completionDate + "\nProject Finalised");
							
							//Close print writer
							pw.close();
						}
						
						catch(IOException e) {
							
							//Error message shall be displayed and user will be taken back to the menu
							System.out.println("Error! File Not Found!");
							FinaliseProject.finaliseProject();
						}
						
					}
					
					catch (InputMismatchException e) {
						
						System.out.println("You have given an invalid input.");
						FinaliseProject.finaliseProject();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					FinaliseProject.finaliseProject();
				}
				
				System.out.println("Project has been finalised and moved to the Completed Projects text file");
				//Send the user back to the menu
				FinaliseProject.finaliseProject();
				Invoice.invoice();
			}
			
			//Project Name
			else if (choice == 2) {
				
				try {
					
					//User Input
					Scanner proName = new Scanner(System.in);
					System.out.println("\nWhat is the Project Name?");
					String searchItem = "Project Name: " + proName.nextLine();
					
					//Opening the file
					File projects = new File("Projects.txt");
					
					//Try-catch for the scanner object
					try {
						
						//Creating scanner object
						Scanner x = new Scanner(projects);
						
						//While Loop
						while(x.hasNextLine()) {
							
							//We scan the lines into the Line variable
							String line = x.nextLine();
							//Increase the index by 1 after adding to line
							index++;
							
							//If the search item is in the line variable
							if (line.contains(searchItem)) {
								
								//I add the index into the itemNum variable and this will be used later to find the selected project.
								itemNum = index;
							}
						}
					}
					
					//If the file is not found this will catch the error
					catch (FileNotFoundException e) {
						
						//File not found message will appear and the user will be taken back to the menu
						System.out.println("Error! File Not Found!");
						EditProject.editProject();
						
					}
					
					//Try-catch for the x scanner just in case the file is not found
					try {
						
						//Creating scanner object
						Scanner x = new Scanner(projects);
						
						//Declaring variables
						String line = "";
						
						//While x has next line the loop will run.
						//While Loop
						while(x.hasNextLine()){
							
							//The String variable line will store lines from the text file
							line = line + x.nextLine() + "\n";
						}
						
						//The line variable will be added to the projectText variable.
						projectText += line;
					}
					
					//If the file is not found this will catch the error
					catch (FileNotFoundException e) {
							
						//File not found message will appear and the user will be taken back to the menu
						System.out.println("Error! File Not Found!");
						EditProject.editProject();
					}
				    
					//Declaring variables
					projectTextArray = projectText.split("\n");
					int index2 = 0;
					selectedProject = new String[20];
					
					//For i in range of the itemNum minus one to 19 this will loop. This is because we know the project selected is a total of 20 items
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						//The item from index i in projectTextArray will be assigned to the index2 value in the selectedProject Array
						selectedProject[index2] = projectTextArray[i];
						//index2 will increase by 1 after the value has been assigned
						index2++;
						
						//If index2 equals 20 the loop will break because it will be out of range
						if (index2 == 20) {
							
							break;
						}
					}
					
					for(int i = 0; i < projectTextArray.length; i++) {
						
						finalProjectTextArray.add(projectTextArray[i]);
						
					}
					
					for(int i = 0; i < 20; i++) {
						
						finalProjectTextArray.remove(selectedProject[i]);
					}
					
					String projectTextString = finalProjectTextArray.toString();
					projectTextString = projectTextString.replace("[", "");
					projectTextString = projectTextString.replace("]", "");
					projectTextString = projectTextString.replace(", ", "\n");
					
					//Opening the projects file again to write in it
					File projects2 = new File("Projects.txt");
					
					//Try-catch for the file writer
					try {
						
						//File and Print Writer objects
						FileWriter fw = new FileWriter(projects2);
						PrintWriter pw = new PrintWriter(fw);
						
						//Write the String into the projects text file
						pw.write(projectTextString);
					
						//Close the Print Writer
						pw.close();
					}
					
					catch(IOException e) {
						
						//Error message shall be displayed and user will be taken back to the menu
						System.out.println("Error! File Not Found!");
						FinaliseProject.finaliseProject();
					}
					
					//Make a String object for the Completed Projects text file
					String finalisedProjectsText = "";
					//Putting the selected project into a String in the correct format
					String selectedProjectString = "\n" + Arrays.toString(selectedProject);
					selectedProjectString = selectedProjectString.replace("[", "");
					selectedProjectString = selectedProjectString.replace("]", "");
					selectedProjectString = selectedProjectString.replace(", ", "");
					
					//Open the Completed Projects text file
					File completedTasks = new File("Completed Projects.txt");
					
					//Try-catch for the scanner x
					try {
						
						//Make Scanner object
						Scanner x = new Scanner(completedTasks);
						
						//Scan through all the lines and add it to the String object
						while(x.hasNextLine()) {
							
							finalisedProjectsText += x.nextLine() + "\n";
						}
					}
					
					catch (FileNotFoundException e) {
						
						//Error message shall be displayed and user will be taken back to the menu
						System.out.println("Error! File Not Found!");
						FinaliseProject.finaliseProject();
					}
					
					try {
						
						Scanner userDate = new Scanner(System.in);
						System.out.println("\nPlease input the completion date of the project: ");
						String completionDate = "Completion Date: " + userDate.nextLine();
						
						//Try-catch for the File Writer
						try {
							
							//Make File and Print Writer objects
							FileWriter fw = new FileWriter(completedTasks);
							PrintWriter pw = new PrintWriter(fw);
							
							//Write the old text and add the new text into the text file
							pw.write(finalisedProjectsText + selectedProjectString + "\n" + completionDate + "\nProjectFinalised");
							
							//Close print writer
							pw.close();
						}
						
						catch(IOException e) {
							
							//Error message shall be displayed and user will be taken back to the menu
							System.out.println("Error! File Not Found!");
							FinaliseProject.finaliseProject();
						}
						
					}
					
					catch (InputMismatchException e) {
						
						System.out.println("You have given an invalid input.");
						FinaliseProject.finaliseProject();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					FinaliseProject.finaliseProject();
				}
				
				System.out.println("\nProject has been finalized and moved to the Completed Projects text file.");
				//Send the user back to the menu
				FinaliseProject.finaliseProject();
				Invoice.invoice();
				
			}
			
			else if (choice == 3) {
				Menu.main(null);
			}
			
			else if (choice == 0) {
				
				System.out.println("\nProgram has ended!");
				System.out.println("Goodbye :)");
				
			}
			
			else {
				
				System.out.println("\nInvalid input recieved! Please make sure you input the number of the corresponding choice.");
				FinaliseProject.finaliseProject();
				
			}
			
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("You have given an invalid input.");
			FinaliseProject.finaliseProject();
		}
		
	}
}
