import java.util.Scanner;

public class Factorial {
    public static int  Factorial(int n ){
        int f = 1;
        
        for(int i = 1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

       int f =  Factorial(n);
       System.out.println("Factorial of given is " +f);

    }
}
