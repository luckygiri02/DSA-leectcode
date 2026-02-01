import java.util.PriorityQueue;

public class K_Largest_Elements_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {2,8,5,89,56,22};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i<arr.length;i++){
            if(i<k){
                pq.add(arr[i]);
            }else{
                if(arr[i] > pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
    
}
