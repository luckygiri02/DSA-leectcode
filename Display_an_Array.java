public class Display_an_Array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length-1;

        Display(arr, n);
        
    }
    public static void Display(int [] arr, int idx){
        if(idx<0){
            return;
        }
        System.out.println(arr[idx]);
        Display(arr, idx-1);
        // System.out.println(arr[idx]);
    }
}
