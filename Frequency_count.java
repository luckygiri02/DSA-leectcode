import java.util.HashMap;

public class Frequency_count {
    public static void main(String[] args) {
        String str = "aabbacsdebsde";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                int old = map.get(ch);
                int newf = old + 1;
                map.put(ch, newf);

            } else {
                map.put(ch, 1);
            }
        }

        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("HIghest Frequency character");

        char maxChar = str.charAt(0);
        int maxFreq = 0;

        for (char key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                maxChar = key;
            }
        }

        // Step 3: Print result
        System.out.println("Highest frequency character: " + maxChar);
        System.out.println("Frequency: " + maxFreq);

    }

}
