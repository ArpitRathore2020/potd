
/*
2799. Count Complete Subarrays in an Array
    Problem Description:
        You are given an array nums consisting of positive integers.
        We call a subarray of an array complete if the following condition is satisfied:
        The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
        Return the number of complete subarrays.
        A subarray is a contiguous non-empty part of an array.

Examples:
    1. 
        - Input: nums = [1,3,1,2,2]
        - Output: 4
        - Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].
    2. 
    - Input: nums = [5,5,5,5]
        - Output: 10
        - Explanation: The array consists only of the integer 5, so any subarray is complete. The number of subarrays that we can choose is 10.

Constraints:
    - 1 <= nums.length <= 1000
    - 1 <= nums[i] <= 2000

*/
import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++)
            hs.add(nums[i]);
        int K = hs.size(); // capital
        for (int k = hs.size(); k <= nums.length; k++) {
            int i = 0;
            int j = 0;
            HashMap<Integer, Integer> hm = new HashMap<>();
            while (j < n) {
                hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);
                if (j - i + 1 < k)
                    j++;
                else {
                    if (hm.size() == K)
                        count++;
                    hm.put(nums[i], hm.get(nums[i]) - 1);
                    if (hm.get(nums[i]) == 0)
                        hm.remove(nums[i]);
                    i++;
                    j++;
                }
            }
        }
        return count;
    }
}