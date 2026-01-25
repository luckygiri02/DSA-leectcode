public class All_Indices_in_Array {
    public static void main(String[] args) {
        int[]arr = {2,3,5,3,8,6,3};

        int [] finalarr = all(arr, 0, 3, 0);

        for(int num : finalarr){
            System.out.println(num);
        }
        
    }

    public static int[] all(int[] arr, int idx, int x, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }

        if(arr[idx]==x){
            int[] ari = all(arr, idx+1, x, fsf+1);
            ari[fsf] = idx;
            return ari;
        }else{
            int[] ari = all(arr, idx+1, x, fsf);
            return ari;
        }
    }
    
}
