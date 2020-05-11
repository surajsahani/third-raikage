package whileLoop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
		int temp = n;
		int reveresedNumber =0;
		
		while(temp > 0) {
			
			int lastDigit = temp % 10;
			
			reveresedNumber = reveresedNumber * 10 + lastDigit;
			
			temp /=10;
			
		}
		if(reveresedNumber ==n) {
			System.out.println(n +" is palindrome");
		}
		else {
			System.out.println(n +" is not palindrome");
		}

	}

}
