public class MagicMatrix {
    public static void magic(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Set diagonal, 1st row, and 1st column to 0
                if (i == j || i == 0 || j == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("before matrix become magic matrix");
        printMatrix(matrix); 

        magic(matrix);  
        System.out.println("after matrix become magic matrix");         // modify the matrix
        printMatrix(matrix);     // print modified matrix
    }
}
