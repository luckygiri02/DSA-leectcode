public class Palindromic_Substrings {
    public static void main(String[] args) {
        String s = "nitin";
        if(ispalindrome(s) == true){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindorme");
        }
        
    }
    public static boolean ispalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i <= j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 != ch2){
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
    
}
