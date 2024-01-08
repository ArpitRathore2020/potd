
/*
Question:
    A. Short Sort
        There are three cards with letters 𝚊, 𝚋, 𝚌 placed in a row in some order. 
        You can do the following operation at most once:
            Pick two cards, and swap them.
        Is it possible that the row becomes 𝚊𝚋𝚌 after the operation? 
        Output "YES" if it is possible, and "NO" otherwise.

Solved on:
    21-09-23

Link:
    https://codeforces.com/contest/1873/problem/A

Limits:
    Time limit per test
        1 second
    Memory limit per test
        256 megabytes

Input:
    The first line contains a single integer 𝑡(1≤𝑡≤6) — the number of test cases.
    The only line of each test case contains a single string consisting of each of the three characters 
    𝚊, 𝚋, and 𝚌
    exactly once, representing the cards.

Output
    For each test case, output "YES" if you can make the row 𝚊𝚋𝚌
    with at most one operation, or "NO" otherwise.
    You can output the answer in any case (for example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as a positive answer).

Example
    Input:
        6
        abc
        acb
        bac
        bca
        cab
        cba
    Output:
        YES
        YES
        YES
        NO
        NO
        YES
*/
import java.util.*;

public class Solution {

    public static String shortSort(String s) {
        if (s.equals("abc")) {
            return "Yes";
        }

        int idx = -1;
        for (int i = 0; i <= 3; i++) {
            if (s.charAt(i) == 'a') {
                idx = i;
                break;
            }
        }

        int val = s.charAt(idx);
        int k = 0;
        for (int j = 1; j <= 2; j++) {
            int nextVal = s.charAt((idx + 1) % 3);
            if (nextVal == val + 1) {
                k++;
            }
        }

        if (k == 2) {
            return "No";
        } else {
            return "Yes";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            System.out.println(shortSort(sc.next()));
        }
    }
}