import java.util.Scanner;

public class CheckTwoStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first string: ");
		String city1 = input.nextLine();
		System.out.println("Enter the second string: ");
		String city2 = input.nextLine();
		
		if(city1.equals(city2)){
			System.out.println("The two strings are equal.");
		}else{
			System.out.println("The two strings are not equal.");
		}
	}

}
