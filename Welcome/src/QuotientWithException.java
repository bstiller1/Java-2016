import java.util.Scanner;

public class QuotientWithException {
	public static int quotient(int num1, int num2){
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two Integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		// Close the Scanner
		input.close();

		try{
		int result = quotient(num1, num2);
		System.out.println(num1 + " / " + num2 + " is "
				+ result);	
		}
		catch (ArithmeticException ex){
			System.out.println("Exception: an integer " 
		+ "cannot be divided by zero " + ex);
		}
		System.out.println("Execution continues...");
	}
}
