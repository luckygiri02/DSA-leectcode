public class MaxSubArray {
    public static void Subarray(int num[]){
        int totalsum  =0 ;
        int maxsum = 0;
        
        for(int i = 0; i<num.length;i++){
            for(int j =i+1 ; j<num.length;j++){
                int sum = 0; 
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print( num[k] +" ");
                    sum = sum + num[k];
                }totalsum = totalsum + sum ;
                if(maxsum<sum){
                    maxsum = sum;
                }
                System.out.print(")");
            }System.out.println(" ");
        }System.out.println("Maximum sum of a sub Array " + maxsum);
        System.out.println("Sum of all subArrays :" + totalsum);
    }
    public static void main(String[] args) {
        int num[]= {-2,1,-3,4,-1,2,1,-5,4};
        Subarray(num);
    }
}
