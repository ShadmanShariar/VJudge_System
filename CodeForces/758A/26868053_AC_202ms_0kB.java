import java.util.Arrays;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner input = new Scanner (System.in);
			
			int n = input.nextInt();
			int [] arr =new int [n];
		for (int i = 0 ; i < n ; i++) {
	arr [i] = input.nextInt();
			
		}
			Arrays.sort(arr);
			
			int sum = 0 ;
			
			for (int i = 0 ; i < n ;i++) {
				sum += arr[n-1] - arr[i];
			}
			System.out.println(sum);
			
			input.close();
		}
	
}