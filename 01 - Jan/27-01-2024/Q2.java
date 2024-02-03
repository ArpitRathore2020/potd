
/*
475. Heaters
    Problem Description:
        Winter is coming! During the contest, your first job is to design a standard heater with a fixed warm radius to warm all the houses.
        Every house can be warmed, as long as the house is within the heater's warm radius range. 
        Given the positions of houses and heaters on a horizontal line, return the minimum radius standard of heaters so that those heaters could cover all houses.
        Notice that all the heaters follow your radius standard, and the warm radius will be the same.

Examples:
    1. 
        - Input: houses = [1,2,3], heaters = [2]
        - Output: 1
        - Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.
    2. 
        - Input: houses = [1,2,3,4], heaters = [1,4]
        - Output: 1
        - Explanation: The two heaters were placed at positions 1 and 4. We need to use a radius 1 standard, then all the houses can be warmed.
    3. 
        - Input: houses = [1,5], heaters = [2]
        - Output: 3

Constraints:
    - 1 <= houses.length, heaters.length <= 3 * 104
    - 1 <= houses[i], heaters[i] <= 109

*/
import java.util.*;

class Solution {
    public boolean coversAll(int[] houses, int[] heaters, int radius) {
        int i = 0;
        int j = 0;
        int m = houses.length;
        int n = heaters.length;
        while (i < m && j < n) {
            if (heaters[j] - radius <= houses[i] && houses[i] <= heaters[j] + radius)
                i++;
            else
                j++;
        }
        return i == m;
    }

    public int findRadius(int[] houses, int[] heaters) {
        int m = houses.length;
        int n = heaters.length;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i = 0;
        int ans = -1;
        int j = Math.max(Math.abs(houses[0] - heaters[n - 1]), Math.abs(houses[m - 1] - heaters[0]));
        while (i <= j) {
            int mid = j + (i - j) / 2;
            if (coversAll(houses, heaters, mid)) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }
}