/* 
Question: Leetcode 268 (Easy)
    Missing Number
    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Solved On 
    01-01-2024

Link
    https://leetcode.com/problems/missing-number/description/

Example 1:
    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Time Complexity: O(N)
Auxiliary Space: O(1)

Constraints:
    n == nums.length
    1 <= n <= 1e4
    0 <= nums[i] <= n
    All the numbers of nums are unique.
*/

class Solution {
    // int range: -2147483648 to 2147483647 therefore using int for sum will suffice
    // as for worst case (n*(n+1)) 1e4 * 1e4+1 = 1e8+1 < 2147483647
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        return ((n) * (n + 1)) / 2 - sum;
    }
}