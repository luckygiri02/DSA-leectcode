public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        int ans  = Factorialnum(n);
        System.out.println(ans);
        
    }
    public static int Factorialnum(int n){
        if(n==1){
            return 1;
        }
        int fn1 = Factorialnum(n-1);
        int fn = n*fn1;
        return fn;
    }

    
}
