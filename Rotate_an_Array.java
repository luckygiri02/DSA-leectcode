public class Rotate_an_Array {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,1,2,3};
        int k = 3;
        reverse(a, k);
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + ",");
        }
        
    }
    public static void rotate(int[] a, int i, int j){
        int li = i;
        int ri = j;

        while(li < ri){
            int temp = a[ri];
            a[ri] = a[li];
            a[li] = temp;

            li++;
            ri--;
        }
    }
    public static void reverse(int[]a, int k){
        k = k%a.length;
        if(k < 0){
            k = k + a.length;
        }


        rotate(a, 0, a.length-k-1);

        rotate(a, a.length-k, a.length-1);

        rotate(a, 0, a.length-1);
    }
    
}
