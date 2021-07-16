package poisedProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//This class will handle the editing of existing projects
public class EditProject {

	//Declaring variables for the entire class
	public static String[] projectTextArray;
	public static String[] selectedProject;
	public static int itemNum;
	
	public static void editProject() {

		try {
			
			/*A menu will appear in front of the user asking which search vector they would like to use. This is because the client would like it to be
			 * possible if the user could search using either the project name or number. The menu would also ask the user if they would like to
			 * return to the menu or end the program. This is for a convenient UI that has all the options.*/
			//Edit Project Menu
			System.out.println("\nPlease select corresponding number of which item you will be searching with: \n" +
								"Project Number - 1\n" +
								"Project Name - 2\n" +
								"Back to menu - 3\n" +
								"End program - 0\n");
			
			//Scanner object to capture the users selection
			Scanner userInput = new Scanner(System.in);
			System.out.print("Selection: ");
			int choice = userInput.nextInt();
			
			//Declaring variables for use in the Method
			String projectText = "";
			int index = 0;
			itemNum = 0;
			
			//Search Using Project Number
			if (choice == 1) {
				
				/*If the user has chosen to search using the project number then the following code will run. The user will be asked for the project 
				* number. The code will then scan through the text file for that project number. It will then store the index			 
				* of the project number and we shall use this to find the indexes of the searched for projects using simple math. The
				* Project itself will be stored in one variable and the rest of the text will be stored in another. The user will then be 
				* prompted to input information as if they were adding a new project however if info is to remain the same they need not 
				* input anything and the information will be taken from the projects variable instead. Once all changes have been made
				* the rest of the text files data will be added to the edited data and the program will have successfully edited to project.*/
				
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
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditProject.editProject();
				}
				
				//The rest of the editing will be done from this class
				EditingProject1.editingProject1();
			}
			
			//Search Using Project Name
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
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditProject.editProject();
				}
				
				//The rest of the editing will be done from this class
				EditingProject2.editingProject2();
			}
			
			//Return to Menu
			else if (choice == 3) {
				
				Menu.main(null);
			}
			
			//End Program
			else if (choice == 0) {
				
				System.out.println("Program has ended!");
				System.out.println("Goodbye :) ");
			}
			
			//If none of the number choices given is entered then they have no entered a valid input and will be told so and returned to the menu
			else {
				
				System.out.println("\nInvalid input recieved! Please make sure you input the number of the corresponding choice.");
				EditProject.editProject();
			}

			userInput.close();
			
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("You have given an invalid input.");
			EditProject.editProject();
		}
		
	}	

}
