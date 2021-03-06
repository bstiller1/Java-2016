import java.util.Scanner;

public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + num1 + " + " + num2 + "?");
		int answer = input.nextInt();
		
		while(num1 + num2 != answer){
			num1 = (int)(Math.random() * 10);
			num2 = (int)(Math.random() * 10);
			System.out.print("Wrong answer. Try again. What is " 
		+ num1 + " + " + num2 + "?");
			answer = input.nextInt();
		}
		input.close();
		System.out.println("You got it!\nIt is about time.");
	}

}
