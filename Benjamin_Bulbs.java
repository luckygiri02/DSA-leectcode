import java.util.*;
public class Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers");
        int n = sc.nextInt();

        for(int i = 1; i*i<=n;i++){
            System.out.println(i*i);
        }
        sc.close();
    }
    
}
