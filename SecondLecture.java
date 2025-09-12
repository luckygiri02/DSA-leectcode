import java.util.Scanner;

public class SecondLecture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // fibonaci series 
        System.out.println("Enter number :");    
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;

        while (count<=n) {
            int temp = b;
            b = b+a;
            a = temp;
            count++;
            System.out.print(b + " "); 
            
        }

    }
}
