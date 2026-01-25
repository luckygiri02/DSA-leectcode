import java.util.Scanner;

public class Saddle_Point {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[][] arr = new int[n1][n2];

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i <arr.length; i++){
            int svj = 0;
            for(int j =0 ; j<arr[0].length; j++){
                if(arr[i][j] < arr[i][svj]){
                    svj = j ;
                }
            }
            boolean flag = true;

        for(int k = 0; k<arr.length; k++ ){
            if(arr[k][svj] > arr[i][svj] ){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println(arr[i][svj]);
            sc.close();
            return;
        } 
        }
        
        System.out.println("invalid output");

        sc.close();
    }
    
}
