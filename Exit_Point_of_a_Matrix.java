import java.util.Scanner;

public class Exit_Point_of_a_Matrix {
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

        int dir = 0;
        int i = 0;
        int j = 0;

        while(true){
            dir = (dir + arr[i][j])%4;

            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }else if(dir==3){
                i--;
            }

            if(i < 0){
                i++;
                break;
            }else if(j < 0){
                j++ ;
                break;
            }else if(i == arr.length){
                i = i-1;
                break ;
            }else if(j == arr[0].length){
                j = j-1;
                break;
            }
        }
        System.out.println("Answer");
        System.out.println(i);
        System.out.println(j);

        sc.close();
    }
    
}
