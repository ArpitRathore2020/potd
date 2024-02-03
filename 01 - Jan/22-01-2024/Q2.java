
/*
Question:
    3. Longest Substring Without Repeating Characters
        Given a string s, find the length of the longest substring without repeating characters.

Link:
    https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

Solved on:
    20-01-2024

Examples:
    1. 
    - Input: s = "abcabcbb"
    - Output: 3
    - Explanation: The answer is "abc", with the length of 3.

    2. 
    - Input: s = "bbbbb"
    - Output: 1
    - Explanation: The answer is "b", with the length of 1.

    3. 
    - Input: s = "pwwkew"
    - Output: 3
    - Explanation: The answer is "wke", with the length of 3. Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:
    - 0 <= s.length <= 5 * 10^4
    - s consists of English letters, digits, symbols, and spaces.


*/
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String ss) {
        char s[] = ss.toCharArray();
        int i = 0;
        int j = 0;
        int n = s.length;
        int ans = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while (j < n) {
            hm.put(s[j], hm.getOrDefault(s[j], 0) + 1);
            if (hm.size() == j - i + 1)
                ans = Math.max(ans, j++ - i + 1);
            else {
                while (hm.size() != j - i + 1) {
                    hm.put(s[i], hm.get(s[i]) - 1);
                    if (hm.get(s[i]) == 0)
                        hm.remove(s[i]);
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}