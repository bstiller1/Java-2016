
public class TestClass {

	public static void main(String[] args) {
		// LinearSearch ls = new LinearSearch();
		// Create array to search
		int myList[] = {1,2,3,4,5}; 
		// Use linearSearch from Class LinearSearch
		// store result in int variable searchResult
		int searchResult = LinearSearch.linearSearch(myList, 4);
		// Display the result
		System.out.print("Match was found at index: " +searchResult);
	}
}