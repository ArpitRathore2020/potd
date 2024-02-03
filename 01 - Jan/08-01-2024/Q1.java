/*
Question:
    A. Digit Minimization 
    There is an integer 𝑛 without zeros in its decimal representation. Alice and Bob are playing a game with this integer. Alice starts first. They play the game in turns.
    On her turn, Alice must swap any two digits of the integer that are on different positions. Bob on his turn always removes the last digit of the integer. The game ends when there is only one digit left.
    You have to find the smallest integer Alice can get in the end, if she plays optimally.

Solved on:
    08-01-2024

Link:
    https://codeforces.com/problemset/problem/1684/A

Limits: 
    1 second
    256 megabytes

Rating:
    800

Input:
    The input consists of multiple test cases. 
    The first line contains a single integer 𝑡(1≤𝑡≤104) — the number of test cases. Description of the test cases follows.
    The first and the only line of each test case contains the integer 𝑛(10≤𝑛≤109) — the integer for the game. 
    𝑛 does not have zeros in its decimal representation.

Output
    For each test case output a single integer — the smallest integer Alice can get in the end of the game.

Example
    Input:
        3
        12
        132
        487456398
    Output
        2
        1
        3

Complexities:
    Time: O(n)
    Space: O(1) 
*/

import java.util.*;
import java.math.BigInteger; // gcd

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- != 0) {
            String s = sc.next();
            int arr[] = new int[s.length()];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < s.length(); i++) {
                arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
                min = Math.min(min, arr[i]);
            }
            if (s.length() == 2) {
                System.out.println(arr[1]);
            } else {
                System.out.println(min);
            }

        }
    }
}