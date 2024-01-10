/*
Question:   
    B. Quick Sort
    You are given a permutation 𝑝 of length 𝑛 and a positive integer 𝑘≤𝑛.
    In one operation, you: 
        * Choose 𝑘 distinct elements 𝑝𝑖1,𝑝𝑖2,…,𝑝𝑖𝑘.
        * Remove them and then add them sorted in increasing order to the end of the permutation.
            For example, if 𝑝=[2,5,1,3,4] and 𝑘=2 and 
            you choose 5 and 3
            then [2,5,1,3,4]→[2,1,4,3,5].
    Find the minimum number of operations needed to sort the permutation in increasing order. 
    It can be proven that it is always possible to do so.

Link:
    https://codeforces.com/problemset/problem/1768/B

Rating:
    900

Solved on:
    10-01-2024

Input:
    The first line contains a single integer 𝑡(1≤𝑡≤104) — the number of test cases. 
    The description of test cases follows.
    The first line of each test case contains two integers 𝑛 and 𝑘(2≤𝑛≤105, 1≤𝑘≤𝑛).
    The second line of each test case contains 𝑛 integers 𝑝1,𝑝2,…,𝑝𝑛 (1≤𝑝𝑖≤𝑛).

Output
    For each test case output a single integer — the minimum number of operations needed to sort the permutation. It can be proven that it is always possible to do so.

Example
    input
        4
        3 2
        1 2 3
        3 1
        3 1 2
        4 2
        1 3 2 4
        4 2
        2 3 1 4
    output
        0
        1
        1
        2

Complexities:
    Time: O(n)
    Space: O(1)
*/

import java.util.Scanner;

public class B_Quick_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            double sCount = 1; // sorted count
            for (int i = 0; i < n; i++)
                if (sc.nextInt() == sCount)
                    sCount++;
            --sCount;
            System.out.println((int) Math.ceil((n - sCount) / k));
        }
        sc.close();
    }
}