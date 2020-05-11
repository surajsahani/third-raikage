package loops;

public class Forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int i=0 ; i < 100 ; i = i+1) {
		System.out.println("Hello World ");
		}

	for (int i=0; i<100 ; i = i +2) {
			System.out.println(i);
		}
	int sum = 0;
		int n=2;		
	for (int i=0 ;i <= n ; i = i+1) {
		sum = sum + i;
		}
		System.out.println("result is " + sum );
	for( int i = 100 ; i >= 1 ; i= i-1) {
		System.out.println(i);
	}
		
	int TableOf = 41;
	for (int i=1 ; i<=10 ; i++) {
	System.out.println(TableOf * i);
	}
	
	int factorOf =6 ;
	//int sum = 1;
	for (int i =1 ; i <= 6 ; i ++) {
    sum =(sum * i);
	}
	System.out.println(sum);
	//System.out.println(factorOf * sum);
		for(int i =0 ;; i++) {
			System.out.println(i);
			
			
		}
	}
}


