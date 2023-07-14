import java.util.Arrays;
import java.util.Scanner;

public class Main {

   
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i >= 0; i++) {
			
			int [] arr = new int [3];
			for (int j = 0; j < 3; j++) {
				arr[j] = input.nextInt();
			}
			if (arr[0]==0&&arr[1]==0&&arr[2]==0) {
				break;
			}
			Arrays.sort(arr);
			int a = (int) Math.pow(arr[0], 2);
			int b = (int) Math.pow(arr[1], 2);
			int c = (int) Math.pow(arr[2], 2);
			if (a+b==c) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
			
		}
		
	}
}