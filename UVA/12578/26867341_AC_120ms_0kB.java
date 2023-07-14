import java.util.Scanner;
public class Main {
	public static void main( String[] args ) {	
				Scanner sc=new Scanner (System.in);
				int t=sc.nextInt();
				while(t-->0){
					double  l=sc.nextDouble();
					double w=(6*l)/10;
					double r=l/5;
					double area=Math.acos(-1)*r*r;			
					System.out.printf("%.2f ",area);
					System.out.printf("%.2f\n",w*l-area);
					
				}
		}
	
}