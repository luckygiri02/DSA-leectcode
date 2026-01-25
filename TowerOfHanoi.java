public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        towerOfhanoi(n, 'S', 'H', 'D');
        
    }

    public static void towerOfhanoi(int n ,char S,char H,char D){

        if(n==0){
            return ;
        }

        towerOfhanoi(n-1, S, D, H);

        System.out.println("disk " +n+ " move from "+ S + " to " + D);

        towerOfhanoi(n-1, H, S, D);

    }
    
}
