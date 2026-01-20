public class Ceil_and_Floor {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80,90,100};
        int data = 51;
        int lo = 0;
        int hi = a.length-1;

        int ceil = 0;
        int floor = 0;

        while(lo <= hi){
            int mid = (lo+hi)/2;

            if(data < a[mid]){
                hi = mid-1;
                ceil = a[mid];
            }else if(data > a[mid]){
                lo = mid + 1;
                floor = a[mid];

            }else {
                ceil = a[mid];
                floor = a[mid];
                break;
            }

            
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
    
}
