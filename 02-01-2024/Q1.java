
/*
Question: 1512. Number of Good Pairs(Easy)
    Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Solved On 
    02-01-2024

Link
    https://leetcode.com/problems/number-of-good-pairs/


Example 1:
    Input: 
        nums = [1,2,3,1,1,3]
    Output: 
        4
    Explanation: 
        There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
    Input: 
        nums = [1,1,1,1]
    Output: 
        6
    Explanation: 
        Each pair in the array are good.

Example 3:
    Input: 
        nums = [1,2,3]
    Output: 
        0
 
Time Complexity: O(n)
Space Complexity: O(n)

Constraints:
    1 <= nums.length <= 100
    1 <= nums[i] <= 100
*/
import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int pairs = 0;
        for (int key : hm.keySet()) {
            int n = hm.get(key);
            if (n != 1) { // There will be no pairs forming for n==1
                pairs += (n * (n - 1)) / 2; // nc2 = Number of ways of choosing 2 among n objects
            }
        }
        return pairs;
    }
}