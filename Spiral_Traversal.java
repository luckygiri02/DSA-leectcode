import java.util.Scanner;

public class Spiral_Traversal {
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
        int minr = 0;
        int minc= 0;
        int maxr = n1-1;
        int maxc = n2-1;

        int turn = n1*n2;
        int count = 0;

        while(count < turn){
            //left wall
            for(int i = minr , j =minc; i<=maxr && count < turn ; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            //bottom wall
            for(int i = maxr , j =minc; j<=maxc && count < turn ; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            //right wall
            for(int i = maxr , j =maxc; i>= minr && count < turn ; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            //upper wall
            for(int i = minr , j =maxc; j>=minc && count < turn ; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
    
}
