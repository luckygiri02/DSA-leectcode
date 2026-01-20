import java.util.*;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] one = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                one[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] two = new int[r2][c2];
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                two[i][j] = sc.nextInt();
            }
        }

        // Condition for multiplication
        if(c1 != r2){
            System.out.println("Invalid output");
            return;
        }

        int[][] prod = new int[r1][c2];

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    prod[i][j] += one[i][k] * two[k][j];
                }
            }
        }

        // Print result
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
