
/*
424. Longest Repeating Character Replacement
Problem Description:
    You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
    Return the length of the longest substring containing the same letter you can get after performing the above operations.
    
Examples:
    1. 
    - Input: s = "ABAB", k = 2
    - Output: 4
    - Explanation: Replace the two 'A's with two 'B's or vice versa.

    2. 
    - Input: s = "AABABBA", k = 1
    - Output: 4
    - Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
        The substring "BBBB" has the longest repeating letters, which is 4. There may exist other ways to achieve this answer too.

Constraints:
    - 1 <= s.length <= 10^5
    - s consists of only uppercase English letters.
    - 0 <= k <= s.length

*/
import java.util.*;

class Solution {
    public int characterReplacement(String ss, int k) {
        char s[] = ss.toCharArray();
        int max = 0;
        int n = s.length;
        if (k == 0) {
            int i = 0;
            int j = 0;
            while (j < n) {
                while (j < n && s[i] == s[j])
                    j++;
                max = Math.max(max, j - i);
                i = j;
            }
        }
        if (k == 0)
            return max;
        for (char c = 'A'; c <= 'Z'; c++) {
            int i = 0;
            int j = 0;
            HashSet<Integer> hs = new HashSet<>();
            while (j < n) {
                if (s[j] != c)
                    hs.add(j);
                if (hs.size() <= k) {
                    max = Math.max(max, j - i + 1);
                    j++;
                } else {
                    while (hs.size() > k) {
                        hs.remove(i);
                        i++;
                    }
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}