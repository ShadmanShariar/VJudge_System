import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
		int n  = input.nextInt();
		
		for (int j =0 ; j < n; j++) {
			
			int a = input.nextInt();
			int [] arr = new int [a];
			for (int i = 0 ; i <a ; i++) {
				
				arr [i] =input.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[0]+arr[1]);
		}
	} 
	
}