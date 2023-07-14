import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
            String s = input.next();
            
            if (s.charAt(0)=='+'||s.charAt(s.length()-1)=='+'){
            a++;
            }
            else {
            a--;
            }
        }
        System.out.println(a);
    }
    
}