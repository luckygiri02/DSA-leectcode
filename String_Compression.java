public class String_Compression {
    public static void main(String[] args) {
        String s = "aaabbcccddeff";

        String s1 = unique(s);
        System.out.println(s1);

        String s2 = count(s);
        System.out.println(s2);
    }

    public static String unique(String s) {
        String sb = s.charAt(0) + "";

        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            char end = s.charAt(i - 1);

            if (cur != end) {
                sb = sb + cur;
            }
        }
        return sb;
    }

    public static String count(String s) {
        String sb = s.charAt(0) + "";
        int count  = 1;

        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            char end = s.charAt(i - 1);

            if (cur == end) {
                count ++;
            }else{
                if(count > 1){
                    sb = sb + count;
                    
                }
                sb = sb + cur;
                count =1;
            }
            
        }
        if(count > 1){
                sb =sb + count;
                count = 1;
            }
        return sb;
    }
}
