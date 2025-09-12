

public class ThirdPatternLecture {
    public static void main(String[] args) {
        int n = 6;
        int m = 7;

        for(int i=1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(i==1||j==1||i==j || i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        System.out.println();
        for(int i =1;i<=n ;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
