import java.util.*;
public class Findnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to serach : ");
        int dig = sc.nextInt();
        index(arr, n, dig);

    }
    public static void index(int arr[] ,int n , int dig){
        for(int i =0; i<n; i++){
            if(arr[i] == dig){
                System.out.println(i);
                break;
            }
           
        }
    }
    
}
