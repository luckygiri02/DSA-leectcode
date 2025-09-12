import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check prime");
        int n = in.nextInt();
        Boolean isprime = true;

        if(n==2){
                System.out.println(n + "is prime number");
            } 
            
            else{
                for(int i = 2; i<=Math.sqrt(n); i++){
                if(n%i == 0 ){
                isprime = false;
            }
        }
        if(isprime==true){
            System.out.println(n + " is prime number");
        }
        else{
            System.out.println(n + " is not prime number");
        }
    }
    
            }
}
