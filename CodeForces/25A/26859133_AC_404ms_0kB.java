import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
			int n = input.nextInt();
			
			int []  arr = new int [n];
			
			int evn =  0 , odd = 0 ;
			
			for (int i = 0 ; i < n ; i++) {
				
				arr[i] = input.nextInt();
				if (arr[i]%2==0) {
					evn++;
				}
				else {odd++;}
			}
			if (evn<odd) {
				
				for (int i = 0 ; i < n ; i++) {
					if (arr[i]%2==0) {
						System.out.println(i+1);
					}
				}
			}
			else {
				for (int i = 0 ; i < n ; i++) {
					if (arr[i]%2!=0) {
						System.out.println(i+1);
					}
				}
				
			}
		input.close();
	} 
	
}