import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		String s = input.next();
		
		int c = 0 ;
		
		for (int i = 0 ; i < s.length(); i++) {
			
			if (s.charAt(i)=='4'||s.charAt(i)=='7') {
				c++;
			}
			
		}
		if (c==4||c==7) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
			
		}
		input.close();
		
	} 
	
}