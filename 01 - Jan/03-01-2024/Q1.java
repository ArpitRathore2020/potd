/*
Question:
    Decreasing Sequence(Easy)
        A sequence a[0], a[1], …, a[N-1] is called decreasing if a[i] >= a[i+1] for each i: 0 <= i < N-1. You are given a sequence of numbers a[0], a[1],…, a[N-1] and a positive integer K. In each 'operation', you may subtract K from any element of the sequence. You are required to find the minimum number of 'operations' to make the given sequence decreasing.
        Note: As the answer can be large return your answer modulo 109+7.

Link:
    https://www.geeksforgeeks.org/problems/decreasing-sequence2722/1

Solved on:
    03-01-2024
        
Example 1:
    Input:
        N = 4, K = 5
        A[] = {1, 1, 2, 3}
    Output:
        3
    Explanation:
        One operation is required to change a[2] = 2
        into -3 and two operations are required to
        change a[3] = 3 into -7. The resulting
        sequence will be 1 1 -3 -7. Hence, in
        total 3 operations are required.
    
Example 2:
    Input:
        N=5, K = 2
        A[] = {5, 4, 3, 2, 1}
    Output:
        0   
    Explanation:
        The sequence is already decreasing. Hence,
        no operations are required in both the cases.

Approach:
    Suppose the sequence is ... a b ...
    Let x be a number such that 
            b - x * k <= a
        =>  x * k >= b - a
        =>  x >= (b - a) / k
    ans as we want an "Integer(long here)" it is equivalent to Math.ceil((b - a) / K))

Complexities:
    Time Complexity: O(N)
    Auxiliary Space: O(1)

Constraints:
    1 <= N <= 106
    1 <= K <= 100
    -106 <= a[i] <= 106
*/

class Compute {
    long MOD = (long) 1e9 + 7;

    public long minMoves(long nums[], long n, long k) {
        double K = (double) k; // otherwise suppose k = 2 then 1/k = 1/2 = 0 not 0.5
        if (n == 1)
            return 0;
        long moves = 0;
        for (int i = 0; i + 1 < n; i++) {
            long a = nums[i];
            long b = nums[i + 1];
            long times = Math.max(0, (long) Math.ceil((b - a) / K));
            moves += times;
            moves %= MOD;
            nums[i + 1] -= k * times; // Don't forget to decrease the value after calculating times
        }
        return moves;
    }
}