
/*
904. Fruit Into Baskets
    Problem Description:
    You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.  
    You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
    - You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
    - Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
    - Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
    Given the integer array fruits, return the maximum number of fruits you can pick.

Examples:
    1. 
        - Input: fruits = [1,2,1]
        - Output: 3
        - Explanation: We can pick from all 3 trees.
    2. 
        - Input: fruits = [0,1,2,2]
        - Output: 3
        - Explanation: We can pick from trees [1,2,2]. If we had started at the first tree, we would only pick from trees [0,1].
    3. 
        - Input: fruits = [1,2,3,2,2]
        - Output: 4
        - Explanation: We can pick from trees [2,3,2,2]. If we had started at the first tree, we would only pick from trees [1,2].

Constraints:
    - 1 <= fruits.length <= 105
    - 0 <= fruits[i] < fruits.length

*/
import java.util.*;

class Solution {
    public int totalFruit(int[] f) {
        int i = 0;
        int j = 0;
        int n = f.length;
        int ans = 0;
        int k = 2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while (j < n) {
            hm.put(f[j], hm.getOrDefault(f[j], 0) + 1);
            if (hm.size() <= k) {
                int sum = 0;
                for (int key : hm.keySet())
                    sum += hm.get(key);
                ans = Math.max(ans, sum);
                j++;
            } else {
                while (hm.size() > k) {
                    hm.put(f[i], hm.get(f[i]) - 1);
                    if (hm.get(f[i]) == 0)
                        hm.remove(f[i]);
                    i++;
                }
                int sum = 0;
                for (int key : hm.keySet())
                    sum += hm.get(key);
                ans = Math.max(ans, sum);
                j++;
            }
        }
        return ans;
    }
}