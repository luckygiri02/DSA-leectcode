public class DecimalToHex {
    public static void main(String[] args) {
        int n = 634;
        int b = 8;

        String result = decimalToAnyBase(n, b);
        System.out.println(result);
    }

    public static String decimalToAnyBase(int n, int b) {
        String rv = "";
        char[] digits = "0123456789ABCDEF".toCharArray();

        while (n > 0) {
            int rem = n % b;
            rv = digits[rem] + rv;
            n = n / b;
        }

        return rv;
    }
}
