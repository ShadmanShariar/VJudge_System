import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat(".000000");
	int n = input.nextInt();
	
	for (int i = 0; i < n; i++) {
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if (x>1000) {
			
			double temp = ((x*y)/100)*10;
			
			double res = (x*y)-temp;
			
			System.out.println(df.format(res));
		}
		else {
			System.out.println(df.format(x*y));
		}
		
		
		
	}
	
        input.close();
        
	}

}