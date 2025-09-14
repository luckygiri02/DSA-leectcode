public class SignoftheProduct {
    public static int product(int[] nums){
       
       int negativeCount = 0;
        
        for (int num : nums) {
            if (num == 0) {
                return 0; // product becomes 0
            }
            if (num < 0) {
                negativeCount++;
            }
        }
        
        // odd negatives → -1, even negatives → 1
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
    public static void main(String[] args) {
        int nums[] = {-1,1,-1,1,-1};
        System.out.println((product(nums)));
    }
}
