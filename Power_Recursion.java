public class Power_Recursion {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;   // base case
        }

        int xm1 = power(x, n - 1);  // x^(n-1)
        int xn = x * xm1;           // x^n
        return xn;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5)); // 32
    }
}
