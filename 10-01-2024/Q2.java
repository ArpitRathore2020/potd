/*
Question:
    B. XOR = Average
        You are given an integer 𝑛. 
        Find a sequence of 𝑛 integers 𝑎1,𝑎2,…,𝑎𝑛 such that 1≤𝑎𝑖≤1e9 for all 𝑖
        and 𝑎1 ⊕ 𝑎2 ⊕ ⋯ ⊕ 𝑎𝑛 = (𝑎1+𝑎2+⋯+𝑎𝑛)/𝑛, where ⊕ represents the bitwise XOR.
        It can be proven that there exists a sequence of integers that satisfies all the conditions above.

Rating:
    900

Link:
    https://codeforces.com/problemset/problem/1758/B

Solved on:
    10-01-2024

Input
    The first line of input contains 𝑡(1≤𝑡≤104) — the number of test cases.
    The first and only line of each test case contains one integer 𝑛(1≤𝑛≤105) — the length of the sequence you have to find.

Output
    For each test case, output 𝑛 space-separated integers 𝑎1,𝑎2,…,𝑎𝑛 satisfying the conditions in the statement.
    If there are several possible answers, you can output any of them.

Example
    input
        3
        1
        4
        3
    output
        69
        13 2 8 1
        7 7 7

Complexities:
    Time: O(n)
    Space: O(1)
*/

import java.util.Scanner;

public class B_XOR_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- != 0) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                while (n-- != 0) {
                    System.out.print("7 ");
                }
            } else {
                int N = n;
                while (n-- != 1) {
                    System.out.print((N + 1) + " ");
                }
                System.out.print(1);
            }
            System.out.println();
        }
    }
}