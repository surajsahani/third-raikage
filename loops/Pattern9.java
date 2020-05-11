package loops;
import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in); // takes input
		    int n = sc.nextInt();
		    for (int i= n; i>= 1; i--)
		    {
		    for (int j=n; j>i;j--)
		    {
		    System.out.print("1");
    }
		    for (int k=1;k<=i;k++)
		    {
		    System.out.print("2");
	    }
		    System.out.println(3);
		

	}

}
}
