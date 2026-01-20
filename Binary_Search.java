public class Binary_Search {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80,90,100};
        int target = 100;
        int start = 0;
        int end = a.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(a[mid] == target){
                System.out.println("Found at index " + mid);
                break;
            }else if(target >= a[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
    }
    
}
