import java.util.Scanner;

public class Pitfall {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a radius: ");
		double radius = input.nextDouble();
		double area;
		input.close();
		if (radius >= 0) {   
			  area = radius * radius * 3.14159;

			System.out.println("The area for the " 
			    + "circle of radius " + radius + 
			    " is " + area);
			}
			else {
			  System.out.println("Negative input");
			}
	}
}
