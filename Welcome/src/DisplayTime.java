import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int hours = minutes / 60;
		int days = hours / 24;
		int remainingSeconds = seconds % 60;
		
		// Close Scanner
		input.close();
		
		//Display results
		System.out.println(seconds + " seconds is " 
		+ minutes + " minutes, " 
				+ remainingSeconds + " seconds, "
				+ hours + " hours and " + days + " days");

	}
}
