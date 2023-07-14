import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
		
		int a = input.nextInt();
		
		int b = input.nextInt();
		
		int sum = a+b;
		
		if (sum%2==0) {
			
			System.out.println(sum/2);
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
		
		input.close();
		
	} 
	
}
