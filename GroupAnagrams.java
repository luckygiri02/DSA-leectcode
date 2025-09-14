import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store: key -> list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Process each word
        for (String s : strs) {
            int[] count = new int[26]; // frequency array for a-z

            // Count each character
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // Build a key string from frequency array
            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append('#'); // delimiter
                sb.append(i);
            }
            String key = sb.toString();

            // Insert into map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    // Testing
    public static void main(String[] args) {
        GroupAnagrams sol = new GroupAnagrams();
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = sol.groupAnagrams(input);
        System.out.println(result);
    }
}
