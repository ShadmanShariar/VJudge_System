import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
	int a = input.nextInt();
	int b = input.nextInt();
	int [] arr= new int [a];
	int []  brr = new int [b];
	
	Arrays.fill(arr,2);
Arrays.fill(brr, 1);
int c = 0;
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < brr.length; j++) {
		if ((arr[i]+brr[j])%2==0) {
			c++;
		}
	}
}
for (int i = 0; i < arr.length-1; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if ((arr[i]+arr[j])%2==0) {
			c++;
		}
	}
}
for (int i = 0; i < brr.length-1; i++) {
	for (int j = i+1; j < brr.length; j++) {
		if ((brr[i]+brr[j])%2==0) {
			c++;
		}
	}
}
System.out.println(c);
	input.close();
	}
}