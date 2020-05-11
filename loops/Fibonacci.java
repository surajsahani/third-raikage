package loops;
import java.util.Scanner;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int a =0;
		int b =1;
		
		System.out.println(a + "");
		System.out.println(b+ " ");
		
		for (int i =0; i<n-2 ; i++) {
			int c = a+b ;
			System.out.println(c+ " ");
			a=b;
			b=c;
		}

}
}
