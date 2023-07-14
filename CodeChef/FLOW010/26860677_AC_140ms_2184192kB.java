import java.util.Scanner;
public class Main {

	public static void main( String[] args ) {	
          
		Scanner input = new Scanner (System.in);
		
	int n = input.nextInt();
	
	for (int i = 0 ; i < n ; i++) {
		
		String s = input.next();
		
		if (s.equals("B")||s.equals("b")) {
			
			System.out.println("BattleShip");
		}
if (s.equals("C")||s.equals("c")) {
			
			System.out.println("Cruiser");
		}
if (s.equals("D")||s.equals("d")) {
	
	System.out.println("Destroyer");
}
if (s.equals("F")||s.equals("f")) {
	
	System.out.println("Frigate");
}	
	}
		
		
	} 
	
}