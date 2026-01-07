import java.util.*;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range where you want to check:");
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int k = low; k <= high; k++){
            boolean isPrime = true;

            if(k <= 1){
                isPrime = false;
            } else {
                for(int i = 2; i <= k / 2; i++){
                    if(k % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime){
                System.out.println(k + " is Prime");
            }
        }
    }
}
