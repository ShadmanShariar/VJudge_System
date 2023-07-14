import java.util.Arrays;
import java.util.Scanner;

public class Main {

   
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);  
        	int n = input.nextInt();
        	if (n<=2) {
        		System.out.println("NO");
        	}
        	else {
        	int [] a = new int[n];
        	for (int i = 0; i < n; i++) {
				
        	a[i] = input.nextInt();
			}
		Arrays.sort(a);
		int c = 0 ;
		for (int i = 0; i < n - 2; i++) {
			if (a[i] + a[i + 1] > a[i + 2]) {
               c++;
			break;}
		}
        if (c>0) {
        	System.out.println("YES");
        }
        else {
        	System.out.println("NO");
        }
        	}
        input.close();
        
	
	}
}