public class Sum_of_two_arrays {
    public static void main(String[] args) {
        int[] arr1 = {9,9,9};
        int[] arr2 = {1};
        int n1 =arr1.length;
        int n2 = arr2.length;

        int[] sum = new int[n1>n2 ? n1:n2];
        int c = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;

        while(k>=0){
            int d =c;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            c = d/10;
            d = d%10;

            sum[k] = d;

            i--;
            j--;
            k--;

           

        }
         if(c!=0){
                System.out.print(c);
            }
        for(int val : sum){
            System.out.print(val);
        }

    }
    
}
