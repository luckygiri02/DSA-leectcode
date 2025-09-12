public class PrintRec {
    public static void PrintDec(int n){
        if(n==1){
            System.out.print("1");
            System.out.println("");
            return;

        }
        System.out.print(n + " ");
        PrintDec(n-1);
    }
    
    public static void PrintIns(int n1){
        if(n1==10){
            System.out.print(10);
            return;

        }
        System.out.print(n1 + " ");
        PrintIns(n1+1);
    }
    public static void main(String[] args) {
        int n =10;
        int n1 = 1;
        PrintDec(n);
        PrintIns(n1);
    }
    
}
