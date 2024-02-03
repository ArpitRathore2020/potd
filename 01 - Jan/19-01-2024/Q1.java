import java.util.*;

class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        for (int i : hm.keySet())
            if (hm.containsKey(i - k))
                count += hm.get(i) * hm.get(i - k);
        return count;
    }
}