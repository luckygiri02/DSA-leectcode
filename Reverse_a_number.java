import java.util.*;
public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("original number : "+n);

        while(n!=0){
            int a = n%10;
            
            System.out.print(a);

            n=n/10;
        }
        sc.close();
    }
    
}
