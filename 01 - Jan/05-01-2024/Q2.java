
/*
Question:
    242. Valid Anagram (easy)
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Link:
    https://leetcode.com/problems/valid-anagram/description/

Solved on:
    23-10-2023

Example 1:
    Input: 
        s = "anagram", t = "nagaram"
    Output: 
        true

Example 2:
    Input: 
        s = "rat", t = "car"
    Output: 
        false
 
Constraints:
    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.

Complexities:
    Time: O(n)
    Space: O(1)
*/
import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> hm_s = new HashMap<>();
        HashMap<Character, Integer> hm_t = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm_s.put(s.charAt(i), hm_s.getOrDefault(s.charAt(i), 0) + 1);
            hm_t.put(t.charAt(i), hm_t.getOrDefault(t.charAt(i), 0) + 1);
        }

        return hm_s.equals(hm_t);
    }
}