public class Toggle_Case {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("LUckY");

        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                char upr = (char) ('A' + ch - 'a');
                sb.setCharAt(i, upr);
            }else if(ch >= 'A' && ch <= 'Z'){
               char low = (char) ('a' + ch - 'A');
                sb.setCharAt(i, low);
            }
        }
        System.out.println(sb.toString());
    }
    
}
