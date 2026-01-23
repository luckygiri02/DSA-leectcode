import java.util.Scanner;

public class Rotate_by_90_degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        

        int[][] arr = new int[n1][n1];

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n1; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0 ; i<arr.length; i++){
            for(int j =i ; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i<arr.length; i++){
            int left = 0;
            int right = arr.length-1;

            while(left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }
         for(int i = 0; i < n1; i++){
            for(int j = 0; j < n1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
