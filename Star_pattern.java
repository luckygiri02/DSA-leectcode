import java.util.*;

public class Star_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int line = in.nextInt();

        for(int i = 1; i<=line; i++){
            for(int star= 1;star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
