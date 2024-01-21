
/*
Question:
    A. GCD vs LCM
    You are given a positive integer 𝑛. You have to find 4 positive integers 𝑎, 𝑏, 𝑐, 𝑑 such that
        𝑎 + 𝑏 + 𝑐 + 𝑑 = 𝑛, and  
        gcd(𝑎, 𝑏) = lcm(𝑐, 𝑑).
    If there are several possible answers, you can output any of them. It is possible to show that the answer always exists.
    In this problem gcd(𝑎, 𝑏) denotes the greatest common divisor of 𝑎 and 𝑏, and lcm(𝑐, 𝑑) denotes the least common multiple of 𝑐 and 𝑑.

Link:
    https://codeforces.com/problemset/problem/1665/A

Solved on:
    13-01-2024

Input:
    The input consists of multiple test cases. The first line contains a single integer 𝑡 (1 ≤ 𝑡 ≤ 10^4) — the number of test cases. Description of the test cases follows.
    Each test case contains a single line with an integer 𝑛 (4 ≤ 𝑛 ≤ 10^9) — the sum of 𝑎, 𝑏, 𝑐, and 𝑑.

Output:
    For each test case, output 4 positive integers 𝑎, 𝑏, 𝑐, 𝑑 such that 𝑎 + 𝑏 + 𝑐 + 𝑑 = 𝑛 and gcd(𝑎, 𝑏) = lcm(𝑐, 𝑑).

Example:
    Input
        5
        4
        7
        8
        9
        10
    Output
        1 1 1 1
        2 2 2 1
        2 2 2 2
        2 4 2 1
        3 5 1 1

*/
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- != 0) {
            System.out.println((sc.nextInt() - 3) + " 1 1 1");
        }
    }
}