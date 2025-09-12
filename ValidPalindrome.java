public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                clean.append(Character.toLowerCase(ch));
            }
        }

        String cleanstr = clean.toString();
        String cleanrsv = clean.reverse().toString();

        return cleanstr.equals(cleanrsv);

    }
    public static void main(String[] args) {
        String s = "ace a car";
        System.out.println(isPalindrome(s));
    }
}
