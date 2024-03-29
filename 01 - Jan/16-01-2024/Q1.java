/*
Question:
    905. Sort Array By Parity
        Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
        Return any array that satisfies this condition.

Link:
    https://leetcode.com/problems/sort-array-by-parity/description/

Solved on:
    16-01-2024

Examples:
    1. 
    - Input: nums = [3,1,2,4]
    - Output: [2,4,3,1]
    - Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

    2. 
    - Input: nums = [0]
    - Output: [0]

Constraints:
    - 1 <= nums.length <= 5000
    - 0 <= nums[i] <= 5000

*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        // Notice that if even numbers come first then automatically odd will come last
        // no extra loop required
        while (j < n) {
            if (nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }
}