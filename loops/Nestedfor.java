package loops;

public class Nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 1; j<=10; j++) {
		for(int i = 1; i<=20; i++) {
			int result = j*i;
			System.out.print(result+ "   ");
		}
		System.out.println();
	}
		

}
}
