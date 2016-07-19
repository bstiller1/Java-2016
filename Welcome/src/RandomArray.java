
public class RandomArray {

	public static void main(String[] args) {
		int[] myList = new int[7];
		int total = 0;
		for (int i = 0; i < myList.length; i++) {
			// populate array with random values 1 - 64
			  myList[i] = 1 + (int) (Math.random() * 65);
			  System.out.print(myList[i] + " ");
			  // Sum up the values
			  total += myList[i];
			}
			System.out.println("\n"+total);
	}

}
