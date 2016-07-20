import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {
		double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		Arrays.sort(numbers);
		
		for(double sortNum : numbers){
		System.out.println(sortNum);
		}
		
		char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
		Arrays.sort(chars);
		for(char sortChar : chars){
			System.out.println(sortChar);
			}
	}
}
