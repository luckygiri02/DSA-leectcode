import java.util.ArrayList;

public class Get_Subsequence {
    public static void main(String[] args) {
        String str = "abcde";
        ArrayList<String> result = gss(str);
        System.out.println(result);
        
    }
    public static ArrayList <String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String sb = str.substring(1);

        ArrayList <String> res = gss(sb);
        ArrayList <String> mres = new ArrayList<>();
        for(String rstr : res ){
            mres.add("" + rstr);

        }

        for(String rstr : res ){
            mres.add(ch + rstr);

        }
        return mres;
    }
}
