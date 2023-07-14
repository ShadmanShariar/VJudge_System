import java.util.Scanner;

public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		int i = 1;
			for (;;) {
				
				String s = input.next();
				
				if (s.equals("*")){
					break;
				}
				if (s.equals("Hajj")) {
					System.out.println("Case "+i+": Hajj-e-Akbar");
				}
				if (s.equals("Umrah")) {
					System.out.println("Case "+i+": Hajj-e-Asghar");
				}
			i++;	
			}
	} 
	
}