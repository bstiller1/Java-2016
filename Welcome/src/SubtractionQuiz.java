import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// Generate two random single-digit integers
		int num1 = (int)(Math.random() * 21);
		int num2 = (int)(Math.random() * 21);
		while(num1 < 10){
			num1 = (int)(Math.random() * 21);
			
		}
		while(num2 < 10){
			num2 = (int)(Math.random() * 21);
			
		}
		
		// if num1 < num2, swap num1 with num2
		if(num1 < num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// Prompt user for answer
		System.out.println("What is " + num1 + " - " + num2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		// Check answer, Display result
		if(num1 - num2 == answer){
			System.out.println("You are correct!");
		}else{
			System.out.println("your answer is wrong.\n"
					+ num1 + " - " + num2 + " should be "
					+ (num1 - num2));
		}	
	}
}
