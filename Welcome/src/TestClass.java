
public class TestClass {

	public static void main(String[] args) {
		String s = "Java Java Java".replaceAll("v\\w", "wi") ;
		String s1 = "Java Java Java".replaceFirst("v\\w", "wi") ;
		String[] s2 = "Java1HTML2Perl".split("\\d");

		System.out.println(s);
		System.out.println(s1);
		
		for(String out : s2){
		System.out.print(out + " ");
		}


}
}
