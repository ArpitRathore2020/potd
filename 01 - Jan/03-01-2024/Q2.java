
/*
Question:
    Majority Element(Easy) 
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Solved on:
    03-01-2024

Link:
    https://leetcode.com/problems/majority-element/description/

Example 1:
    Input: 
        nums = [3,2,3]
    Output:
        3

Example 2:
    Input: 
        nums = [2,2,1,1,1,2,2]
    Output: 
        2

Approach:
    Boyer-Moore Majority Voting Algorithm
        As the number of times majority element appears > ⌊n / 2⌋ therefore
        Combined appearance of all numbers cannot exceed number of times majority element appears
 
Complexities:
    Time: O(n)
    Auxiliary Space: O(1)

Constraints:
    n == nums.length
    1 <= n <= 5 * 104
    -109 <= nums[i] <= 109
*/

class Solution {
    public int majorityElement(int[] nums) {
        // Boyer-Moore Majority Voting Algorithm
        int count = 0;
        int ans = -1;
        for (int num : nums) {
            if (count == 0) {
                ans = num;
                count++;
            } else if (ans == num)
                count++;
            else
                count--;
        }
        return ans;
    }
}