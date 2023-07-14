import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        int sum = 0 ;
        
        int temp;
        for (int i = 0; i < n; i++) {
            
            int x = input.nextInt();
            temp = x;
            
            while (temp!=0){
            int z = temp %10;
               
                sum = sum + z;
            temp = temp/10; 
            }    
            
            System.out.println(sum);
            sum = 0;
            temp= 0;
        }
        
    }
}