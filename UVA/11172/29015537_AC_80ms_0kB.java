import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner  input = new Scanner (System.in);
        
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int x = input.nextInt();
            int y = input.nextInt();
            
            if(x<y){
                System.out.println("<");
            }
            if(x>y){
                System.out.println(">");
            }
          if (x==y){
           System.out.println("=");
          }
        }
        
    }
}