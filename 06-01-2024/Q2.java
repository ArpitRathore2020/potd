
/*
Question:
    Jump Game II (Medium)
    You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
    Each element nums[i] represents the maximum length of a forward jump from index i. 
    In other words, if you are at nums[i], you can jump to any nums[i + j] where:
        0 <= j <= nums[i] and
        i + j < n
    Return the minimum number of jumps to reach nums[n - 1]. 
    The test cases are generated such that you can reach nums[n - 1].

Link:
    https://leetcode.com/problems/jump-game-ii/description/

Solved on:
    06-01-2024

Example 1:
    Input: 
        nums = [2,3,1,1,4]
    Output: 
        2
    Explanation: 
        The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:
    Input: 
        nums = [2,3,0,1,4]
    Output: 
        2

Complexities:
    Time: O(n^2)
    Space: O(n)

Constraints:
    1 <= nums.length <= 104
    0 <= nums[i] <= 1000
    It's guaranteed that you can reach nums[n - 1]
*/
import java.util.*;

class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1;
        int dp[] = new int[nums.length + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= Math.min(i - 1 + nums[i - 1], n); j++) {
                dp[j] = Math.min(dp[j], dp[i - 1] + 1);
            }
        }
        return dp[n];
    }
}