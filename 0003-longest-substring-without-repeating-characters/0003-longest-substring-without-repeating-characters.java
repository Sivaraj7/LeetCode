
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        boolean[] seen = new boolean[128]; 
        while (end < n) {
            char currentChar = s.charAt(end);
            
            
            while (seen[currentChar]) {
                seen[s.charAt(start)] = false;
                start++;
            }
            
           
            seen[currentChar] = true;
            
           
            int currentLength = end - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
            
            end++;
        }
        
        return maxLength;
    }
}
