import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		int []  arr = new int [n];
		int []  arr2 = new int [n];
		for (int i = 0; i < n ; i++) {
	
           		arr[i] = input.nextInt();
           		arr2[i] = arr[i];
			
		}
		
		Arrays.sort(arr2);
int c =0 ;
		for (int i =0 ; i < n ;i++) {
			
			if (arr[i]!= arr2[i]) {
				c++;
			}
		}
		if (c<=2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		input.close();
		
	} 
	
}