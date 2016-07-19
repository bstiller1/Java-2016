
public class Increment {
	// Global variable x
final static int X = 1;
	public static void main(String[] args) {
		
		System.out.println("Before the call, X is " + X);
		// x is passed by value to method increment()
		// as an argument
		increment(X);
		System.out.println("After the call, X is " + X);
	}
	public static void increment(int n){
		n++;
		// Local Variable n 
		System.out.println("n inside the method is " + n);
		// Global variable x
		System.out.println("X inside the method is " + X);
		
	}
}
