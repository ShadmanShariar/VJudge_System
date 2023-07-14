import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
	int n = input.nextInt();
	
	for (int i = 0 ; i < n ; i++) {
	
		int a = input.nextInt();
		int fac = 1 ;
		for (int j = 1 ; j <= a ; j++ ) {
			fac = fac * j ;
		}
		System.out.println(fac);
		
	}
		
		
	} 
	
}