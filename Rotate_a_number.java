import java.util.*;
public class Rotate_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The rounds you rotate number : ");
        int k = sc.nextInt();

        int temp = n;
        int node = 0;

        while(temp>0){
            temp = temp/10;
            node++;
        }
        k = k%node;
        if(k>0){
            k = k+node;
        }
        int div = 1;
        int mul = 1;
         for(int i =1; i<=node; i++){
            if(i <= k){
                div = div *10;
            }
            else{
                mul = mul*10;
            }
         }

        int q = n/div;
        int r = n%div;
        int r1 = r*mul+q;

        System.out.println(r1);


    }
    
}
