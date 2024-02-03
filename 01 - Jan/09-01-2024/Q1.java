
/* 
Question:
    Fractional Knapsack (Medium)
    Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
    Note: Unlike 0/1 knapsack, you are allowed to break the item here. 

Link:
    https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1

Solved on:
    09-01-2024

Example 1:
    Input:
        N = 3, W = 50
        value[] = {60,100,120}
        weight[] = {10,20,30}
    Output:
        240.000000
    Explanation:
        Take the item with value 60 and weight 10, value 100 and weight 20 and split the third item with value 120 and weight 30, to fit it into weight 20. so it becomes (120/30)*20=80, so the total weight becomes 60+100+80.0=240.0
        Thus, total maximum value of item we can have is 240.00 from the given capacity of sack. 

Example 2:
    Input:
        N = 2, W = 50
        value[] = {60,100}
        weight[] = {10,20}
    Output:
        160.000000
    Explanation:
        Take both the items completely, without breaking.
        Total maximum value of item we can have is 160.00 from the given capacity of sack.

Complexities:
    Time Complexity : O(NlogN)
    Auxilliary Space: O(1)

Constraints:
    1 <= N <= 105
    1 <= W <= 109
    1 <= valuei, weighti <= 104
*/
import java.util.*;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) {
        double value = 0;
        Arrays.sort(arr, Comparator.comparingDouble(o -> (o.value + 0.0) / o.weight));
        for (int i = n - 1; i >= 0; i--) {
            Item curr = arr[i];
            if (W >= curr.weight) {
                W -= curr.weight;
                value += curr.value;
            } else {
                value += W * (curr.value + 0.0) / curr.weight;
                break;
            }
        }
        return value;
    }
}