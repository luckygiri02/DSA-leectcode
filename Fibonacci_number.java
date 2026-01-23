import java.util.*;
public class Fibonacci_number {
    public static void main(String[] args) {
        System.out.println("Enter the count where you want to print: ");
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int a = 0;
        int b = 1;
         for(int i =0; i<high; i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;


         }

         sc.close();
    }
}
