"""
Question:
    1. Two Sum
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

Link:
    https://leetcode.com/problems/two-sum/description/

Solved on:
    10-02-2021

Examples:
    1. 
    - Input: nums = [2,7,11,15], target = 9
    - Output: [0,1]
    - Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    2.
    - Input: nums = [3,2,4], target = 6
    - Output: [1,2]

    3.
    - Input: nums = [3,3], target = 6
    - Output: [0,1]

Constraints:
    - 2 <= nums.length <= 10^4
    - -10^9 <= nums[i] <= 10^9
    - -10^9 <= target <= 10^9
    - Only one valid answer exists.

"""

class Solution:
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if i != j and nums[i]+nums[j] == target:
                    return [i,j]
                    exit()
        