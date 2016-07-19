
public class TestMax {

	public static void main(String[] args) {
int i = 5;
int j = 2;
int h = 7;
int k = max(i, j);
int l = max(i, j, h);
System.out.println("The max of " + i + " and " + j + " is " + k);
System.out.println("The max of " + i + " and " + j + " and " + h + " is " + l);
	}
	
	public static int max(int num1, int num2){
		int result;
		if(num1 > num2){
			result = num1;
		}else{
			result = num2;
		}
		return result;
	}
	public static int max(int num1, int num2, int num3){
		int result = 0;
		if(num1 > num2){
			result = num1;
		}
		if(result < num2){
				result = num2;
			}
		if(result < num3){
					result = num3;
		}
		return result;	} }

