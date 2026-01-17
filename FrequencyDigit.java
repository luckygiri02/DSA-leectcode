public class FrequencyDigit {
    public static void main(String[] args) {
        int n =345974476;
        int d = 2;
        int count = getdigit(n, d);
        System.out.println(count);
        
    }
    public static int getdigit(int n , int d){
        int rv =0;
        while(n>0){
            int dig = n%10;
            n=n/10;

            if(dig==d){
                rv++;
            }
        }


        return rv;
    }
}
