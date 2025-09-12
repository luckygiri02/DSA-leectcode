public class ReverseArray {
    public static void Reversearray(int num[]){
        int first = 0;
        int last = num.length-1;

        while (first<last) {
            int temp= 0;
            temp = num[last];
            num[last] = num[first];
            num[first] = temp ;

            first++;
            last--;

         }
    }
    public static void main(String[] args) {
        int num[] = {4,7,1,9,2,0,8,3};
        System.out.println("before swap");
        for(int i = 0; i<num.length;i++){
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        Reversearray(num);
        System.out.println("After swap");
        for(int i = 0; i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }
}
