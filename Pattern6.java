public class Pattern6 {
    public static void main(String[] args) {
        int n =7;
        int st = 7;
        int sp = 0;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=st; j++){
                if(i>1&& i<=n/2 && j>1 && j<st){
                    System.out.print(" ");
                }else{
                System.out.print("*");
                }
            }
            
            System.out.println();
            if(i<=n/2){
                sp++;
                st-=2;
            }
            else{
                st+=2;
                sp--;
            }
        }
    }
    
}
