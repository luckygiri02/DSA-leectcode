import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i<nums.length;i++){
            for(int j = 1 ; j<nums.length-1; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
            
        }
        return false;
    }
//     using Hashset reduce time complexity
// adding something new
        public static boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // duplicate mila
            }
            set.add(num);
        }
        return false; // koi duplicate nahi
    }
        
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate1(nums));
    }
    
}
