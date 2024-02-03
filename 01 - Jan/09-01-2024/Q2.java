/* 
Question:   
    A. Desorting
    Call an array 𝑎 of length 𝑛 sorted if 𝑎1≤𝑎2≤…≤𝑎𝑛−1≤𝑎𝑛.
    Ntarsis has an array 𝑎 of length 𝑛.
    He is allowed to perform one type of operation on it (zero or more times):
        Choose an index 𝑖(1≤𝑖≤𝑛−1).
        Add 1 to 𝑎1,𝑎2,…,𝑎𝑖.
        Subtract 1 from 𝑎𝑖+1,𝑎𝑖+2,…,𝑎𝑛.
    The values of 𝑎 can be negative after an operation.
    Determine the minimum operations needed to make 𝑎 not sorted.

Rating:
    800

Link:
    https://codeforces.com/problemset/problem/1853/A

Solved on:
    09-01-2024
    
Limits: 
    1 second
    256 megabytes

Input
    Each test contains multiple test cases. The first line contains the number of test cases 𝑡(1≤𝑡≤100). 
    The description of the test cases follows.
    The first line of each test case contains a single integer 𝑛 (2≤𝑛≤500) — the length of the array 𝑎.
    The next line contains 𝑛 integers 𝑎1,𝑎2,…,𝑎𝑛 (1≤𝑎𝑖≤109) — the values of array 𝑎.
    It is guaranteed that the sum of 𝑛 across all test cases does not exceed 500.

Output
    Output the minimum number of operations needed to make the array not sorted.

Example
    Input:
        4
        2
        1 1
        4
        1 8 10 13
        3
        1 3 2
        3
        1 9 14
    Output:
        1
        2
        0
        3

Complexities:
    Time: O(n)
    Space: O(1)
*/

import java.util.*;
import java.math.BigInteger; // gcd

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- != 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                long rem = (arr[i + 1] - arr[i]) % 2;
                double diff = 0;
                if (rem == 0)
                    ++diff;
                diff += (arr[i + 1] - arr[i]) / 2.0d;
                min = Math.min(min, Math.max(0, (int) Math.ceil(diff)));
            }
            System.out.println(min);
        }
    }
}