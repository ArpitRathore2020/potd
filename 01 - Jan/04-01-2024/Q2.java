/*
Question: 
    Rotate String
    Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
    A shift on s consists of moving the leftmost character of s to the rightmost position.
    For example, if s = "abcde", then it will be "bcdea" after one shift.

Solved on:
    04-01-2024

Link:
    https://leetcode.com/problems/rotate-string/description/
 
Example 1:
    Input: 
        s = "abcde", goal = "cdeab"
    Output: 
        true

Example 2:
    Input: 
        s = "abcde", goal = "abced"
    Output: 
        false
 
Constraints:
    1 <= s.length, goal.length <= 100
    s and goal consist of lowercase English letters.

Complexities:
    Time: O(n)
    Space: O(n)
*/
class Solution {
    public boolean rotateString(String s, String goal) {
        // for goal to be formed by s it must be a subset of s + s
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}