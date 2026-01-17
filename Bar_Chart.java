import java.util.*;
public class Bar_Chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int max =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int floor = max ; floor>0; floor--){
            for(int i = 0; i<arr.length; i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        
    }
    
}
