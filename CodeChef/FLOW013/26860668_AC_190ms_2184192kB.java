import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
	int n = input.nextInt();
	
	for (int i = 0 ; i < n ; i++) {
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if (a+b+c==180) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
		
		
	} 
	
}