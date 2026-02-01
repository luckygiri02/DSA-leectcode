import java.util.ArrayList;

public class Get_Keypad_Combination {
    public static void main(String[] args) {
        String str = "678";
        ArrayList<String> pres = Getkpc(str);
        System.out.print(pres + " ");
    }
    static String[] codes = {",:", "abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> Getkpc(String str){
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String sb = str.substring(1);

        ArrayList<String> res = Getkpc(sb);
        ArrayList<String> myres = new ArrayList<>();

        int idx = ch-'0';
        String cod = codes[idx];

        for(int i = 0; i<cod.length(); i++){
            char chode = cod.charAt(i);
            for(String rstr : res){
                myres.add(chode + rstr);
            }
        }

        return myres;
    }
    
}
