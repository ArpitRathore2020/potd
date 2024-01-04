/*
Question:
    Longest Common Prefix (Easy)
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

Solved on:
    04-01-2024

Link:
    https://leetcode.com/problems/longest-common-prefix/description/

Example 1:
    Input: 
        strs = ["flower","flow","flight"]
    Output: 
        "fl"

Example 2:
    Input: 
        strs = ["dog","racecar","car"]
    Output: 
        ""
    Explanation: 
        There is no common prefix among the input strings.

Constraints:
    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters.

Variables:
    n be the length of strs 
    m be the length of the shortest string in strs

Complexities:
    Time: O(n * m) 
    Space:
        Including Output: O(m)
        Excluding Output: O(1)
        
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder("");
        for (int i = 0;; i++) {
            Character c = null;
            for (int j = 0; j < strs.length; j++) {
                String s = strs[j];
                if (i >= s.length()) // reached end of the shortest string
                    return ans.toString();
                if (c == null) // Initialize the character to compare with upcoming strings
                    c = s.charAt(i);
                else if (s.charAt(i) != c) // character no longer match
                    return ans.toString();
            }
            ans.append(c);
        }
    }
}