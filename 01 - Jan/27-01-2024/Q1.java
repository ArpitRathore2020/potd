
/*
560. Subarray Sum Equals K
    Problem Description:
        Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
        A subarray is a contiguous non-empty sequence of elements within an array.

Examples:
    1. 
    - Input: nums = [1,1,1], k = 2
    - Output: 2
    2. 
    - Input: nums = [1,2,3], k = 3
    - Output: 2

Constraints:
    - 1 <= nums.length <= 2 * 104
    - -1000 <= nums[i] <= 1000
    - -107 <= k <= 107

*/
import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int num : nums) {
            sum += num;
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
            if (hm.containsKey(sum - k)) {
                if (k != 0)
                    ans += hm.get(sum - k);
                else
                    ans += hm.get(sum - k) - 1;
            }
        }
        return ans;
    }
}
