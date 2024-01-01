/*
Question 1(Easy)
    Second Largest
    Given an array Arr of size N, print second largest distinct element from an array.

Solved On 
    01-01-2024

Link
    https://practice.geeksforgeeks.org/problems/second-largest3735/0

Example 1:
    Input: 
        N = 6
        Arr[] = {12, 35, 1, 10, 34, 1}
    Output: 
        34
    Explanation: 
        The largest element of the 
        array is 35 and the second largest element
        is 34.

Example 2:
    Input: 
        N = 3
        Arr[] = {10, 5, 10}
    Output:
        5
    Explanation: 
        The largest element of 
        the array is 10 and the second 
        largest element is 5.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
    2 ≤ N ≤ 1e5
    1 ≤ Arr[i] ≤ 1e5
*/

class Solution {
    int print2largest(int arr[], int n) {
        int max = -1; // 1 <= Arr[i] therefore -1 < Arr[i] for all i
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int secondMax = -1; // return -1 if no such element found && 1 <= Arr[i] therefore -1 < Arr[i] for
                            // all i
        for (int i = 0; i < n; i++) {
            if (max != arr[i]) { // Update only if max != second Max
                secondMax = Math.max(secondMax, arr[i]);
            }
        }
        return secondMax;
    }
}