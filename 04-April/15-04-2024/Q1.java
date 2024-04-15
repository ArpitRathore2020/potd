import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();
        long sets = (int) Math.pow(2, nums.length) - 1;
        List<Integer> list;
        for (long i = 0; i <= sets; i++) { // O(2^n)
            list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) { // O(n)
                if (((i >> j) & 1) == 1) { // O(logn)
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return new ArrayList<>(ans);
    }
}

// Time complexity: O((2^n) * n * log(n))
// Space: Not sure but my guess is it's O(n^2)