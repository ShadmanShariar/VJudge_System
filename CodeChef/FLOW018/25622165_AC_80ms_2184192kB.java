import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner  input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int  x = input.nextInt();
           int sum = 1;
            for (int j = 1; j <= x; j++) {
                sum = sum * j;
            }
            System.out.println(sum);
            sum= 0;
        }
        
    }
}