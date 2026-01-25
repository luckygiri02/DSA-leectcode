public class Maximum_of_an_RArray {
    public static void main(String[] args) {
        int[] arr = {10,60,50,90,39};
        int max = maxarry(arr, 0);
        System.out.println(max);
        
    }

    public static int maxarry(int[] arr ,int idx){
        
        if(idx == arr.length-1){
            return arr[idx];
        }
        int max = maxarry(arr, idx+1);
        if(max > arr[idx]){
            return max;
        }else{
            return arr[idx];
        }


       
    }
    
}
