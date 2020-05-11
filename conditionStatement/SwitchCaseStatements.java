package conditionStatement;

public class SwitchCaseStatements {

	public static void main(String[] args) {
	 int dayOfWeek = 3 ;
 
//	 if (dayOfWeek == 1) {
//		 
//	 }
//	 
//	 if (dayOfWeek == 2) {
//		 
//	 }
//	 
//	 if (dayOfWeek == 3) {
//		 
//	 }
//	 
//	 if (dayOfWeek == 4) {
//		 
//	 }
//	 
//	 if (dayOfWeek == 5) {
//		 
//	 }
//	 
//	 if (dayOfWeek == 6) {
//		 
//	 }
//	 
//	if (dayOfWeek == 7) {
//		System.out.println("I am out today");
//		
//	}
//	
//	}
//
//}
	 
	 switch(dayOfWeek) {
	 case 1 :
	 case 2:
		 System.out.println("I'm on leave");
		 break;
	 case 3:
		 System.out.println("I'm plyaing football");
		 break;
		 
		 default:
		 System.out.println("I don't know what day it is");
	 }
	}
}	
