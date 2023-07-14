import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        for (;;) {
            

        long a = input.nextLong();
        long b = input.nextLong();
        if (a==0&&b==0){
        break;
        }
        System.out.print(a/b+" ");
        System.out.print(a%b+" ");
        System.out.println("/ "+b);
        }
    }
}
