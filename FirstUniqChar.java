import java.util.*;

public class FirstUniqChar {
    
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first index where freq == 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}

    


