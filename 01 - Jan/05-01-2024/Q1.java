
/*
Question:
    A. Love Story
    Timur loves codeforces. That's why he has a string 𝑠 having length 10
    made containing only lowercase Latin letters. Timur wants to know how many indices string 𝑠
    differs from the string "codeforces".
    Note that you can't reorder the characters in the string 𝑠

Rating:
    800

Solved on:
    05-01-2024

Link:
    https://codeforces.com/contest/1829/problem/A

Limits:
    Time: 1 second
    Memory: 256 MB

Example:  
    𝑠 = "coolforsez" differs from "codeforces" in 4 indices, shown in bold.

Input:
    The first line contains a single integer 𝑡 (1≤𝑡≤1000) — the number of test cases.
    Each test case is one line and contains the string 𝑠, consisting of exactly 10 lowercase Latin characters.

Output
    For each test case, output a single integer — the number of indices where string 𝑠 differs.

Code Example:
    Input:
        5
        coolforsez
        cadafurcie
        codeforces
        paiuforces
        forcescode
    Output:
        4
        5
        0
        4
        9

Complexities:
    Time: O(n)
    Space: O(1)
*/
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- != 0) {
            String s = "codeforces";
            String g = sc.next();
            int len = s.length();
            int ans = 0;
            while (--len != -1) {
                if (s.charAt(len) != g.charAt(len)) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}