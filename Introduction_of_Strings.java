public class Introduction_of_Strings {
    public static void main(String[] args) {
        String s = "lucky";
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1 ; j<= s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
    
}
