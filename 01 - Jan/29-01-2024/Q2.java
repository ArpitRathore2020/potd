import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Approach 2: count elemets less than target, start from that index to number
        // of times target appears

        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;

        // Floor
        int floor = -1;
        while (i <= j) {
            int mid = j + (i - j) / 2;
            if (nums[mid] == target) {
                floor = mid;
            }
            if (nums[mid] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }

        // Ceil
        i = 0;
        j = nums.length - 1;
        int ceil = -1;
        while (i <= j) {
            int mid = j + (i - j) / 2;
            if (nums[mid] == target) {
                ceil = mid;
            }
            if (nums[mid] <= target)
                i = mid + 1;
            else
                j = mid - 1;
        }

        List<Integer> ans = new ArrayList<>();
        for (int x = Math.max(0, floor); x <= ceil; x++)
            ans.add(x);
        return ans;
    }
}