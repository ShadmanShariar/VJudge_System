import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
	
		int  n = input.nextInt();
		
		int [] arr = new int [n];
		int [] brr = new int [n];
		
		
		for (int i = 0; i < n; i++) {
			
			arr[i] = input.nextInt();
			int x = arr[i];
			brr[i] = x;
		}
		
		Arrays.sort(arr);
		int c = 0;
		
		for (int i = 0; i < brr.length; i++) {
			if (arr[i]!=brr[i])c++;
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