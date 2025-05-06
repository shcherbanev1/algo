package medium.task3;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        while (i < s.length()) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            i++;
            ans = Math.max(ans, i - j);
        }
        return ans;
    }

}