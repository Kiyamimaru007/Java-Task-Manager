package poisedProject;

import java.util.Arrays;

//This class will generate an invoice for the client if necessary
public class Invoice extends FinaliseProject{

	public static void invoice() {
		
		//Declaring variables for later use
		int amountDue = 0;
		String totalFeeString = selectedProject[5];
		String totalPaidString = selectedProject[6];
		String[] totalFeeArray = totalFeeString.split(": ");
		String[] totalPaidArray = totalPaidString.split(": ");
		int totalFee = Integer.parseInt(totalFeeArray[1]);
		int totalPaid = Integer.parseInt(totalPaidArray[1]);
		String custDetails = selectedProject[16] + "\n" + selectedProject[17] + "\n" + selectedProject[18] + "\n" + selectedProject[19];
		
		//If the totalFee and totalPaid is equal no invoice needs to be generated
		if (totalFee == totalPaid) {
			
			//Message to show the account is up to date
			System.out.println("\nCustomer is up to date with all payments.");
		}
		
		//Else an invoice will be generated
		else {
			
			//Calculate the amount due
			amountDue = totalFee - totalPaid;
			//Print out all the details
			System.out.println("\nInvoice:\n" + custDetails + "\n" + totalFeeString + "\n" + totalPaidString + "\nAmount Due: R" + amountDue);	
		}
	}
}
