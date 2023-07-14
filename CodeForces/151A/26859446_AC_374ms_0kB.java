import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		int l = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int p = input.nextInt();
		int nl = input.nextInt();
		int np = input.nextInt();
		
		int [] arr = new int [3];
		
		arr[0] = c*d;
		arr[1] = (k*l)/nl;
		arr[2] = p/np;
		Arrays.sort(arr);
		System.out.println(arr[0]/n);
		input.close();
		
	} 
	
}