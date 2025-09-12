public class FourthLecture {
    public static void factorial(int n){
        int fac = 1;
        for(int i = n ; i>1;i--){
            fac= fac*i;
        }
        System.out.println(fac);
        return;
    }
    public static void main(String[] args) {
       int n=4;
       factorial(n);
    }
    
}
