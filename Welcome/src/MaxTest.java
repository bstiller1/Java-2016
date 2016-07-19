
public class MaxTest {

	public static void main(String[] args) {
		// Create Object tm from Class TextMax.java to use the methods
		//TestMax tm = new TestMax();
		int num1 = 4;
		int num2 = 5;
		int num3 = 6;
		// Method max() from TestMax.java is static this way is preferred
		// ClassName.Method(param1, param2);
		int maxNum = TestMax.max(num1, num2, num3);
		
		System.out.print("The max between " + num1 + ", " + num2 
				+ ", " + num3 + " is " + maxNum);

	}

}
