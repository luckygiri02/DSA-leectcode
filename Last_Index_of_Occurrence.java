public class Last_Index_of_Occurrence {
    public static void main(String[] args) {
        int[] var1 = new int[]{10, 5, 6, 3, 7, 5};
      int var2 = last(var1, 0, 5);
      System.out.println(var2);
        
    }

    public static int last(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }

        int lisa = last(arr, idx+1, x);
        if(lisa == -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return lisa;
        }
    }
    
}
