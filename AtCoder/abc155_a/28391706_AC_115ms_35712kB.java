import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
	
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a==b&&a!=c||b==c&&b!=a||c==a&&c!=b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
		input.close();
	}
}