package poisedProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EditingProject2 extends EditProject{

	public static void editingProject2() {
		
		try {
			
			//Menu
			System.out.println("\nPlease input the number corresponding to your choice: " +
								"\nProject Number - 1 " +
								"\nProject Name - 2 " +
								"\nProject Type - 3 " +
								"\nProject Physical Address - 4 " +
								"\nProject ERF Number - 5 " +
								"\nTotal Fee - 6 " +
								"\nTotal Paid - 7 " +
								"\nProject Deadline - 8 " +
								"\nArchitect Info - 9 " +
								"\nContractor Info - 10 " +
								"\nCustomer Info - 11 " +
								"\nBack To Menu - 12 " +
								"\nEnd Program - 0 ");
			
			//Get user selection
			Scanner userSel = new Scanner(System.in);
			System.out.println("\nSelection: ");
			int choice = userSel.nextInt();
			
			//If the user would like edit the project number
			if (choice == 1) {
				
				try {
					
					//Retrieve the new information from the user and add it to the Array in the correct position 
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Project Number or input nothing to cancel and return to the menu: ");
					String input = userInput.nextLine();
					
					//If there is nothing in the input variable
					if (input.length() == 0) {
						
						//Return to the menu
						EditingProject2.editingProject2();
					}
					
					//Else 
					else {
						
						//Input is added to the array in the correct format
						input = "Project Number: " + input;
						selectedProject[0] = input;
					}
					
					//The new data must be added to the project text and then to the project text file.
					int index = 0;
					
					//For loop to add the new information to the correct position in the Array
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							
							break;
						}
					}
					
					//Add the Array to a String object to write into the Projects text file
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					//Open the text file
					File projects = new File("Projects.txt");
					
					//try-catch block for the file writer object
					try {
						
						//Make File and Print writer objects to simply write the edited text into the projects text file
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						//Close the Print Writer object
						pw.close();
					}
					
					catch(IOException e) {
						
						//Error message shall be displayed and user will be taken back to the menu
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				//Loop back to the menu just in case the user has more editing to do
				EditingProject2.editingProject2();
			}
			
			else if (choice == 2) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Project Name or input nothing to cancel and return to the menu: ");
					String input = userInput.nextLine();
					
					if (input.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						input = "Project Name: " + input;
						selectedProject[1] = input;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 19; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			else if (choice == 3) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Project Type or input nothing to cancel and return to the menu: ");
					String input = userInput.nextLine();
					
					if (input.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						input = "Project Type: " + input;
						selectedProject[2] = input;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			else if (choice == 4) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Project Physical Address or input nothing to cancel and return to the menu: ");
					String input = userInput.nextLine();
					
					if (input.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						input = "Project Physical Address: " + input;
						selectedProject[3] = input;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			else if (choice == 5) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Project ERF Number or input nothing to cancel and return to the menu: ");
					String input = userInput.nextLine();
					
					if (input.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						input = "Project ERF Number: " + input;
						selectedProject[4] = input;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			else if (choice == 6) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Total Fee or input nothing to cancel and return to the menu: ");
					String input = userInput.nextLine();
					
					if (input.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						input = "Total Fee: " + input;
						selectedProject[5] = input;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			else if (choice == 7) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Total Paid or input nothing to cancel and return to the menu: ");
					String input = userInput.nextLine();
					
					if (input.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						input = "Total Paid: " + input;
						selectedProject[6] = input;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			else if (choice == 8) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Project Deadline or input nothing to cancel and return to the menu: ");
					String input = userInput.nextLine();
					
					if (input.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						input = "Project Deadline: " + input;
						selectedProject[7] = input;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			//This will be used to edit the Architects Information
			else if (choice == 9) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Architects Name or input nothing to cancel and return to the menu: ");
					String archName = userInput.nextLine();
					
					if (archName.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						archName = "Architect Name: " + archName;
						selectedProject[8] = archName;
					}
					
					System.out.println("\nInput the new Architects Telephone Number or input nothing to cancel and return to the menu: ");
					String archTelNum = userInput.nextLine();
					
					if (archTelNum.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						archTelNum = "Architect Telephone Number: " + archTelNum;
						selectedProject[9] = archTelNum;
					}
					
					System.out.println("\nInput the new Architects Email or input nothing to cancel and return to the menu: ");
					String archEmail = userInput.nextLine();
					
					if (archEmail.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						archEmail = "Architect Email: " + archEmail;
						selectedProject[10] = archEmail;
					}
					
					System.out.println("\nInput the new Architects Address or input nothing to cancel and return to the menu: ");
					String archAddress = userInput.nextLine();
					
					if (archAddress.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						archAddress = "Architect Address: " + archAddress;
						selectedProject[11] = archAddress;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			//This will be used to edit the Contractors Information
			else if (choice == 10) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Contractors Name or input nothing to cancel and return to the menu: ");
					String conName = userInput.nextLine();
					
					if (conName.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						conName = "Contractor Name: " + conName;
						selectedProject[12] = conName;
					}
					
					System.out.println("\nInput the new Contractors Telephone Number or input nothing to cancel and return to the menu: ");
					String conTelNum = userInput.nextLine();
					
					if (conTelNum.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						conTelNum = "Contractor Telephone Number: " + conTelNum;
						selectedProject[13] = conTelNum;
					}
					
					System.out.println("\nInput the new Contractors Email or input nothing to cancel and return to the menu: ");
					String conEmail = userInput.nextLine();
					
					if (conEmail.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						conEmail = "Contractor Email: " + conEmail;
						selectedProject[14] = conEmail;
					}
					
					System.out.println("\nInput the new Contractors Address or input nothing to cancel and return to the menu: ");
					String conAddress = userInput.nextLine();
					
					if (conAddress.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						conAddress = "Contractor Address: " + conAddress;
						selectedProject[15] = conAddress;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			//This will be used to edit the Customers Information
			else if (choice == 11) {
				
				try {
					
					Scanner userInput = new Scanner(System.in);
					System.out.println("\nInput the new Customers Name or input nothing to cancel and return to the menu: ");
					String custName = userInput.nextLine();
					
					if (custName.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						custName = "Customer Name: " + custName;
						selectedProject[16] = custName;
					}
					
					System.out.println("\nInput the new Customers Telephone Number or input nothing to cancel and return to the menu: ");
					String custTelNum = userInput.nextLine();
					
					if (custTelNum.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						custTelNum = "Customer Telephone Number: " + custTelNum;
						selectedProject[17] = custTelNum;
					}
					
					System.out.println("\nInput the new Customer Email or input nothing to cancel and return to the menu: ");
					String custEmail = userInput.nextLine();
					
					if (custEmail.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						custEmail = "Customer Email: " + custEmail;
						selectedProject[18] = custEmail;
					}
					
					System.out.println("\nInput the new Customers Address or input nothing to cancel and return to the menu: ");
					String custAddress = userInput.nextLine();
					
					if (custAddress.length() == 0) {
						EditingProject2.editingProject2();
					}
					
					else {
						
						custAddress = "Customer Address: " + custAddress;
						selectedProject[19] = custAddress;
					}
					
					int index = 0;
					
					for(int i = itemNum - 2; i < i + 18; i++) {
						
						projectTextArray[i] = selectedProject[index];
						index++;
						
						if (index == 20) {
							break;
						}
					}
					
					String editedText = Arrays.toString(projectTextArray);
					editedText = editedText.replace("[", "");
					editedText = editedText.replace("]", "");
					editedText = editedText.replace(", ", "\n");
					
					File projects = new File("Projects.txt");
					
					try {
						
						FileWriter fw = new FileWriter(projects);
						PrintWriter pw = new PrintWriter(fw);
						
						pw.write(editedText);
						
						pw.close();
					}
					
					catch(IOException e) {
						
						System.out.println("Error! File Not Found!");
						EditingProject2.editingProject2();
					}
					
				}
				
				catch (InputMismatchException e) {
					
					System.out.println("You have given an invalid input.");
					EditingProject2.editingProject2();
				}
				
				EditingProject2.editingProject2();
			}
			
			//Back to Menu
			else if (choice == 12) {
				
				Menu.main(null);
			}
			
			//End program
			else if (choice == 0) {
				
				System.out.println("Program has ended!");
				System.out.println("Goodbye :) ");
			}
			
			else {
				
				System.out.println("\nInvalid input recieved! Please make sure you input the number of the corresponding choice.");
				EditingProject2.editProject();
			}
			
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("You have given an invalid input.");
			EditingProject2.editingProject2();
		}

	}

}
