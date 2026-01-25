public class First_Index_of_Occurrence {
    public static void main(String[] args) {
        int[] arr = {10,5,6,3,7,5};
        int ans = occurance(arr, 0, 100);
        System.out.println(ans);
        
    }

    public static int occurance(int[] arr, int idx, int x){
    if(idx == arr.length) return -1;
    if(arr[idx] == x) return idx;
    return occurance(arr, idx + 1, x);
}

    
}
