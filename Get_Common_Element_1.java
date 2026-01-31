import java.util.HashMap;

public class Get_Common_Element_1 {
    public static void main(String[] args) {
        int[] a1 = {1,1,2,3,4,5,3,2,1};
        int[] a2 = {1,5,2,9,8,7};
        

        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i = 0; i<a1.length; i++){
            if(map.containsKey(a1[i])){
                int o = map.get(a1[i]);
                int n = o + 1;
                map.put(a1[i], n);
            }else{
                map.put(a1[i], 1);
            }
        }

        for(int s : a2){
            if(map.containsKey(s)){
                System.out.print(s);
                map.remove(s);
            }
        }
    }
    
}
