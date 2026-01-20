public class Inverse_of_an_Array {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,0};
        int[] in = inverse(arr);
        for(int i = 0 ; i<in.length; i++){
            System.out.print(in[i] + " ");
        }
        
    }
    public static int[] inverse(int[] arr){
        int[] inv = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            int v = arr[i];
            inv[v] = i;
        }

        return inv;
    }
    
}
