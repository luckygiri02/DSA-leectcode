import java.util.Scanner;

public class Diagonal_Traversal {
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

        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j =g ; j < arr.length; i++, j++ ){
                System.out.println(arr[i][j]);
            }
        }
        sc.close();
    }
    
}
