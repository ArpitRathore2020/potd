class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int ans = 0;
        for (int t = 0; t < n; t++)
            if (nums[t] % 2 == 0 && nums[t] <= threshold)
                ans = 1;
        while (i < n) {
            while (i < n && (nums[i] % 2 != 0 || nums[i] > threshold))
                i++;
            j = i;
            while (j < n - 1 && nums[j] % 2 != nums[j + 1] % 2 && nums[j + 1] <= threshold)
                j++;
            if (i < n && i != j)
                ans = Math.max(j - i + 1, ans);
            i = j + 1;
        }
        return ans;
    }
}