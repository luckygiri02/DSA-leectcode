public class LongestRepeating {
    public int characterReplacement(String s, int k) {
        int[] count =new int[26];
        int result =0 , maxcount = 0 ,left = 0;
        for(int right = 0; right <s.length();right++){
            count[s.charAt(right) - 'A']++;
            maxcount = Math.max(maxcount ,count[s.charAt(right) - 'A'] );
        

        while((right - left +1)-maxcount > k){
            count[s.charAt(left) - 'A']--;
            left++;
        }
        result = Math.max(result , right-left+1);
        }
return result;
    }
}
