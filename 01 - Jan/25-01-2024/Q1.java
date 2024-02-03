/*
75. Sort Colors
    Problem Description:
        Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
        You must solve this problem without using the library's sort function.

Examples:
    1. 
        - Input: nums = [2,0,2,1,1,0]
        - Output: [0,0,1,1,2,2]
    2. 
        - Input: nums = [2,0,1]
        - Output: [0,1,2]

Constraints:
    - n == nums.length
    - 1 <= n <= 300
    - nums[i] is either 0, 1, or 2.

*/

class Solution {
    public void sortColors(int[] nums) {
        // approach 2 would be to store number of time 0, 1 and 2 occur in an array
        int i = 0;
        int j = 0;
        int n = nums.length;
        while (j < n) {
            if (nums[j] == 0) {
                nums[j] = nums[i] + nums[j] - (nums[i] = nums[j]);
                i++;
            }
            j++;
        }
        j = 0;
        while (j < n) {
            if (nums[j] == 1) {
                nums[j] = nums[i] + nums[j] - (nums[i] = nums[j]);
                i++;
            }
            j++;
        }
        j = 0;
        while (j < n) {
            if (nums[j] == 2) {
                nums[j] = nums[i] + nums[j] - (nums[i] = nums[j]);
                i++;
            }
            j++;
        }
    }
}