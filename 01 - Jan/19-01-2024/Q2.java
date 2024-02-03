import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = nums.length;
        long ans = 0;
        while (j < n) {
            sum += nums[j];
            hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);
            if (j - i + 1 < k)
                j++;
            else {
                if (hm.size() == k)
                    ans = Math.max(ans, sum);
                sum -= nums[i];
                hm.put(nums[i], hm.get(nums[i]) - 1);
                if (hm.get(nums[i]) == 0)
                    hm.remove(nums[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}