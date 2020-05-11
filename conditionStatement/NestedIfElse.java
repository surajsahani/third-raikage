package conditionStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		int a =60,b=120,c=30;
		int result = 0 ;
//		if (a > b) {
//			if(a > c) {
//			result = a;
//		} else {
//			result = c;
//		}
//		} else {
//			if(b > c) {
//			result = b;
//		} else {
//			result = c;
//		}
		result = (a > b ? a > c ? a : c : b > c ? b : c);
		System.out.println("the largest number is " + result);
	}
//		System.out.println("the largest of all three numbers is " + result);
	}
		
		

