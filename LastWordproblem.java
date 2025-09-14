public class LastWordproblem {
    
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // 1. Ignore trailing spaces (from right side)
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 2. Count characters until next space or start of string
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}

    

