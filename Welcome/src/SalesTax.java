import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		// Close Scanner input
		input.close();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" 
		+ (tax * 100) / 100);

	}

}
