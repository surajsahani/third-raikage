package methods;

public class Methods {

	public static void main(String[] args) {
		
	  int firstNumber =34;
	  int secondNumber =23;
	  
	  int result = maxOf(firstNumber, secondNumber);

	  maxOf(100,200);
	  
	  maxOf(2,4);
	  
	  System.out.println(result);
	  sayHi();
	}
	
	static int maxOf(int a,int b) {
		if (a >b ) {
			return a;
		} else {
			return b;
		}
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good morning");
	}
}

