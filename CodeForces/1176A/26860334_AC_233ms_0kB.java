import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
		int n  = input.nextInt();
		
		for (int j =0 ; j < n; j++) {
		long a = input.nextLong();
		
	int c =0, p =0;
		for (;; ) {
			
			if (a%2==0) {
				a = a/2;
				c++;
			}
			if (a%3==0) {
				
				a = (2*a)/3;
			c++;
			}
			if (a%5==0) {
				a = (4*a)/5;
			c++;
			}
		if (a==1) {
			p++;
			break;
		}
		
		if (a%2!=0&&a%3!=0&&a%5!=0) {
			break;
		}
		
		}
		if (p>0) {
			System.out.println(c);
		}
		else {
			System.out.println(-1);
		}
		}	
	} 
	
}