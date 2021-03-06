import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Enter annual interest rate in percentage
		System.out.println("Enter annual interest rate, eg. 7.25%: ");
		double annualInterestRate = input.nextDouble();
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		// Enter number of years
		System.out.println("Enter number of years as an Integer, eg. 5: ");
		int numOfYears = input.nextInt();
		// Enter loan amount
		System.out.println("Enter loan amount, eg. 120000.95: ");
		double loanAmount = input.nextDouble();
		input.close();
		// Calculate payment
		double monthlyPayment = loanAmount * 
				monthlyInterestRate / (1 - 1 / Math.pow(1 
						+ monthlyInterestRate, numOfYears * 12));
		double totalPayment = monthlyPayment * numOfYears * 12;
		// Display results
		System.out.println("The monthly payment is $" 
		+ (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" 
		+ (int)(totalPayment * 100) / 100.0);
	}
}
