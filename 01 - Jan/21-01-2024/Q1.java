class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int val = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i + 1; k < j; k++) {
                    if (Math.abs(target - nums[i] - nums[j] - nums[k]) < val) {
                        val = Math.abs(target - nums[i] - nums[j] - nums[k]);
                        ans = nums[i] + nums[j] + nums[k];
                    }

                }
            }
        }
        return ans;
    }
}