/*
Question:
    942. DI String Match
        A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
        - s[i] == 'I' if perm[i] < perm[i + 1], and
        - s[i] == 'D' if perm[i] > perm[i + 1].
        Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

Link:
    https://leetcode.com/problems/di-string-match/description/

Solved on:
    14-01-2024

Examples:
    1. 
    - Input: s = "IDID"
    - Output: [0,4,1,3,2]

    2.
    - Input: s = "III"
    - Output: [0,1,2,3]

    3.
    - Input: s = "DDI"
    - Output: [3,2,0,1]

Constraints:
    - 1 <= s.length <= 105
    - s[i] is either 'I' or 'D'.

*/
class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int arr[] = new int[n + 1];
        int curr = 0;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == 'I')
                arr[i] = curr++;
        arr[n] = curr++;
        for (int i = n - 1; i >= 0; i--)
            if (s.charAt(i) == 'D')
                arr[i] = curr++;
        return arr;
    }
}