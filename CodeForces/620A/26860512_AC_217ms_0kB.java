import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int sum =0 , sum2 = 0;
		if (a>c) {
			sum = a-c;
		}
		else {
			sum = c-a;
		}
		if (b>d) {
			sum2 = b-d;
		}
		else {
			sum2 = d-b;
		}
		System.out.println(Math.max(sum, sum2));
		
	} 
	
}