import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        input.nextLine();
        String [] array = new String [n*2];
        for (int i = 0; i < n*2; i++) {
            array [i] = input.nextLine();
        }
       
int n2 = input.nextInt();
input.nextLine();
        for (int i = 0; i < n2; i++) {
            String s = input.nextLine();
            for (int j = 0; j < array.length; j++) {
                if(s.matches(array[j])){
                    System.out.println(array[j+1]);
                }
            }
            
        }
        
    }
}
