import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		
		for (int i = 0; i < n ; i++) {
			
			int a = input.nextInt();
			
			int sum = 0 ;
			
			int temp = a;
			
			while (temp!=0) {
				
				int r = temp % 10 ;
				sum += r;
				temp = temp / 10;
				
			}
			
			System.out.println(sum);
		}
		
		input.close();
		
	} 
	
}
