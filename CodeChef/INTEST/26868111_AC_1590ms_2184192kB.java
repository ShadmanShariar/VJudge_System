import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner input = new Scanner (System.in);
			
			int n = input.nextInt();
           int k = input.nextInt();
           int c = 0;
		for (int i = 0 ; i < n ; i++) {
	
			int a = input.nextInt();
			
			if (a%k==0) {
				
				c++;
			}
			
			
			
		}
			System.out.println(c);
			input.close();
		}
	
}