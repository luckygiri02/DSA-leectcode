public class FactorialRec {
    public static int Factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        int fnm1 = Factorial(n - 1); 
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = Factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}


// public class FactorialRec {
//     public static int Factorial(int n){
//         int fnm1 = Factorial(n-1);
//         int fn = n * fnm1;
//         if(n==0){
            
//             return 1;
//         }
//         return fn;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         Factorial(n);
//     }
    
// }
