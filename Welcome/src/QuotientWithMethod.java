import java.util.Scanner;

public class QuotientWithMethod {
	public static int quotient(int num1, int num2){
		if(num2 == 0){
			System.out.println("Second Integer cannot be 0");
			System.exit(1);
		}
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two Integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		// Close the Scanner
		input.close();

		int result = quotient(num1, num2);
		System.out.println(num1 + " / " + num2 + " is "
				+ result);
		
	}
}
