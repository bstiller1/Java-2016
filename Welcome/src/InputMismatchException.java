import java.util.*;

public class InputMismatchException extends Throwable {
	public static int quotient(int num1, int num2)
	throws CustomException{
		if(num2 == 0){
		return num1 / num2;
		}else{
			throw new CustomException(newRadius);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two Integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		// Close the Scanner
	

		try{
		double result = quotient(num1, num2);
		System.out.println(num1 + " / " + num2 + " is "
				+ result);	
		}

		catch (ArithmeticException ex){
			System.out.println("Exception: an integer " 
		+ "cannot be divided by zero ");
		}
			input.close();
	}
}
