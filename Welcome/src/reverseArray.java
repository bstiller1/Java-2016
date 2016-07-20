
public class reverseArray {
	
	public static void main(String[] args){
		int[] list1 = {1, 2, 3, 4, 5, 6};
		int[] list2 = reverse(list1);
		// Enhanced "for loop" or foreach loop
		for(int myList: list2){
			System.out.print(myList);
		} // end for
} // end main
	public static int[] reverse(int[] list) {
		  int[] result = new int[list.length];
		
		  for (int i = 0, j = result.length - 1; 
		       i < list.length; i++, j--) {
		    result[j] = list[i];
		  } // end for
		  return result;
	} // end reverse


} // end Class reverseArray
