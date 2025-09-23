public class StringsAreEqual {
    


    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // Concatenate word1
        for (String w : word1) {
            sb1.append(w);
        }

        // Concatenate word2
        for (String w : word2) {
            sb2.append(w);
        }

        // Compare final strings
        return sb1.toString().equals(sb2.toString());
    }
}
