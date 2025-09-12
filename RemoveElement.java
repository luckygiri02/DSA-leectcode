public class RemoveElement {
     public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]!= val){
                nums[index] = nums[i];
                index ++;
            }
            
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;

        int newLength = removeElement(nums, val);

        System.out.print("Array after removing " + val + ": ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    } 
    }
    

