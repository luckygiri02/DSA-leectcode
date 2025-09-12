import java.util.Scanner;

public class Character_continue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int line = in.nextInt();
        char ch = 'A';

        for(int i = 1; i<=line; i++){
            for(int star= 1;star<=i; star++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
