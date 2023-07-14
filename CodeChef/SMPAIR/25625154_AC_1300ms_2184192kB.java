import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int m = input.nextInt();
            
            int [] elements = new int [m];
            
            for (int j = 0; j < m; j++) {
                elements [j] = input.nextInt();
            }
            Arrays.sort(elements);
        System.out.println(elements[0]+elements[1]);
        }
           
                
        
        
    }
  
}