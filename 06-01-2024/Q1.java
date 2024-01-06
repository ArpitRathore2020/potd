
/*
Question:
    A palindrome is a string that reads the same from left to right as from right to left. For example, abacaba, aaaa, abba, racecar are palindromes.
    You are given a string 𝑠 consisting of lowercase Latin letters. 
    The string 𝑠 is a palindrome.
    You have to check whether it is possible to rearrange the letters in it to get another palindrome (not equal to the given string).

Rating:
    800

Solved on:
    06-01-2024

Link:
    https://codeforces.com/problemset/problem/1832/A

Limits:
    Time: 2 second
    Memory: 256 MB

Input:
    The first line contains a single integer 𝑡(1≤𝑡≤1000) — the number of test cases.
    The only line of each test case contains a string 𝑠 (2≤|𝑠|≤50) consisting of lowercase Latin letters. This string is a palindrome.

Output
    For each test case, print YES if it is possible to rearrange the letters in the given string to get another palindrome. Otherwise, print NO.

Code Example:
    Input:
        3
        codedoc
        gg
        aabaa

    Output:
        YES
        NO
        NO

Complexities:
    Time: O(n)
    Space: O(1)

*/
import java.util.*;

public class A_New_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- != 0) {
            String s = sc.next();
            Character prev = s.charAt(0);
            boolean allSame = true;
            for (int i = 1; i < s.length() / 2; i++) {
                if (prev != s.charAt(i)) {
                    allSame = false;
                    break;
                }
            }
            System.out.println(allSame ? "NO" : "YES");
        }
    }
}