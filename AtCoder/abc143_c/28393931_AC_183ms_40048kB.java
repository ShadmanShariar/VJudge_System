import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		long t = input.nextLong();
	
		String s = input.next();
		
	   long c = 1;
		char ch = s.charAt(0);
	   for (int i = 1; i < s.length(); i++) {
		
		   if (s.charAt(i)!=ch) {
			   c++;
			   ch = s.charAt(i);
		   }
	   
	}
		
		System.out.println(c);
		
		input.close();
	}
}