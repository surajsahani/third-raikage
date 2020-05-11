package loops;

import java.util.Scanner;

public class Break {

<<<<<<< HEAD
	public static void main(String[] args) {
	for(int i=1 ;i<=100 ;i++)
		{
		if (i==35) {
			break;
			}
		System.out.println(i);
	}
	Scanner sc = new Scanner(System.in);
=======
//	public static void main(String[] args) {
//	for(int i=1 ;i<=100 ;i++)
//	{
//		if (i==35) {
//			break;
//		}
//			System.out.println(i);
//		}
//	Scanner sc = new Scanner(System.in);
>>>>>>> ba360de1d001250a540a394c4d2c4c5db7060343
	
	for(;;) {
		int n = sc.nextInt();
				
				if(n<0) {
					break;
				}
	
	}

}
}
