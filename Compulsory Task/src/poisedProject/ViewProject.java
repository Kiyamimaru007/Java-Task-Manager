package poisedProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//This class will be used to view projects
public class ViewProject {

	//Declaring variables for the entire class
	public static String[] projectTextArray;
	public static String[] selectedProject;
	public static int itemNum;
	
	public static void viewProject() {
		
		try {
			
			System.out.println("\nYou have chosen to view projects");
			System.out.println("\nPlease select one of the following choices by entering the corresponding number:" +
								"\nView Existing Project Using Project Number - 1" +
								"\nView Existing Project Using Project Name - 2" +
								"\nView All Existing Projects - 3" +
								"\nView All Completed Projects - 4" +
								"\nBack To Menu - 5" +
								"\nClose Program - 0");
			
			Scanner userSel = new Scanner(System.in);
			System.out.println("\nSelection: ");
			int selection = userSel.nextInt();
			
			//Declaring variables for use in the Method
			String projectText = "";
			int index = 0;
			itemNum = 0;
			
			//Project Number
			if (selection == 1) {
				
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
					ViewProject.viewProject();
				}
				
				//Convert the Array into a string and make it the correct format
				String selectedProjectString = Arrays.toString(selectedProject);
				selectedProjectString = selectedProjectString.replace("[", "");
				selectedProjectString = selectedProjectString.replace("]", "");
				selectedProjectString = selectedProjectString.replace(", ", "\n");
				
				//Print out the project
				System.out.println("\nThis is the project you have selected:\n");
				System.out.println(selectedProjectString);
				
				//Send the user back to the menu
				ViewProject.viewProject();
				
			}
			
			//Project Name
			else if (selection == 2) {
				
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
					ViewProject.viewProject();
				}
				
				//Convert the array to a string in the correct format
				String selectedProjectString = Arrays.toString(selectedProject);
				selectedProjectString = selectedProjectString.replace("[", "");
				selectedProjectString = selectedProjectString.replace("]", "");
				selectedProjectString = selectedProjectString.replace(", ", "\n");
				
				//Print the project to screen
				System.out.println("\nYou have selected this project:\n");
				System.out.println(selectedProjectString);
				
				//Send the user back to the menu
				ViewProject.viewProject();
				
			}
			
			//All Existing Projects
			else if (selection == 3) {
				
				File projects = new File("Projects.txt");
				
				try {
					
					Scanner x = new Scanner(projects);
					
					String line = "";
					
					while(x.hasNextLine()) {
						
						line = line + x.nextLine() + "\n";
					}
					
					projectText = line;
					
					System.out.println(projectText);
					
				}
				
				catch (FileNotFoundException e) {
					
					System.out.println("Error! File Not Found!");
					Menu.main(null);
				}
				
				ViewProject.viewProject();
				
			}
			
			//All Completed Projects
			else if (selection == 4) {
				
				File completedProjects = new File("Completed Projects.txt");
				
				try {
					
					Scanner x = new Scanner(completedProjects);
					
					String line = "";
					
					while(x.hasNextLine()) {
						
						line = line + x.nextLine() + "\n";
						
					}
					
					projectText = line;
					
					System.out.println(projectText);
					
				}
				
				catch (FileNotFoundException e) {
					
					System.out.println("Error! File Not Found!");
					Menu.main(null);
					
				}
				
				ViewProject.viewProject();
				
			}
			
			//Back To Menu
			else if (selection == 5) {
				
				Menu.main(null);
			}
			
			//Close Program
			else if (selection == 0) {
				
				System.out.println("\nProgram has ended!");
				System.out.println("Goodbye :)");
			}
			
			else {
				
				System.out.println("\nInvalid input recieved! Please make sure you input the number of the corresponding choice.");
				ViewProject.viewProject();
			}
			
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("You have given an invalid input.");
			ViewProject.viewProject();
		}
		
	}
	
}
