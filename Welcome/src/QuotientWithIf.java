import java.util.Scanner;

public class QuotientWithIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two Integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		// Close the Scanner
		input.close();
		// Check if the 2nd Integer "num2" == 0
		if(num2 != 0){
		System.out.println(num1 + " / " + num2 + " is "
				+ (num1 / num2));	
		}else{
			System.out.println("Second Integer cannot be 0");
		}
		
		
	}
}
