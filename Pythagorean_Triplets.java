import java.util.*;

public class Pythagorean_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Triplets Number for checking : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max, x, y;

        if (a >= b && a >= c) {
            max = a;
            x = b;
            y = c;
        } 
        else if (b >= a && b >= c) {
            max = b;
            x = a;
            y = c;
        } 
        else {
            max = c;
            x = a;
            y = b;
        }

        if (max * max == x * x + y * y) {
            System.out.println("True (Pythagorean Triplet)");
        } else {
            System.out.println("False (Not a Pythagorean Triplet)");
        }

        sc.close();
    }
}
