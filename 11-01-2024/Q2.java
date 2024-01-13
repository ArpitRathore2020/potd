/*
C. Cypher
Luca has a cypher made up of a sequence of 𝑛 wheels, each with a digit 𝑎𝑖 written on it. On the 𝑖-th wheel, he made 𝑏𝑖 moves. 
    Each move is one of two types:
        up move (denoted by 𝚄): it increases the 𝑖-th digit by 1
            After applying the up move on 9, it becomes 0.
        down move (denoted by 𝙳): it decreases the 𝑖-th digit by 1
            After applying the down move on 0, it becomes 9

Link:
    https://codeforces.com/problemset/problem/1703/C

Solved on:
    11-01-2024

Input
    The first line contains a single integer 𝑡(1≤𝑡≤100) — the number of test cases.
    The first line of each test case contains a single integer 𝑛(1≤𝑛≤100) — the number of wheels.
    The second line contains 𝑛 integers 𝑎𝑖(0≤𝑎𝑖≤9) — the digit shown on the 𝑖-th wheel after all moves have been performed.
    Then 𝑛 lines follow, the 𝑖-th of which contains the integer 𝑏𝑖(1≤𝑏𝑖≤10) and 𝑏𝑖characters that are 
    either 𝚄 or 𝙳
        — the number of moves performed on the 𝑖
        -th wheel, and the moves performed. 
    𝚄 and 𝙳 represent an up move and a down move respectively.

Output
    For each test case, output 𝑛 space-separated digits  — the initial sequence of the cypher.

Example
    input
        3
        3
        9 3 1
        3 DDD
        4 UDUU
        2 DU
        2
        0 9
        9 DDDDDDDDD
        9 UUUUUUUUU
        5
        0 5 9 8 3
        10 UUUUUUUUUU
        3 UUD
        8 UUDUUDDD
        10 UUDUUDUDDU
        4 UUUU
    output
        2 1 1 
        9 0 
*/

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- != 0) {
            int wheels = sc.nextInt();
            int arr[] = new int[wheels];
            for (int i = 0; i < wheels; i++)
                arr[i] = sc.nextInt();
            for (int i = 0; i < wheels; i++) {
                int count = 0;
                int n = sc.nextInt();
                String s = sc.next();
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == 'D')
                        count--;
                    else if (s.charAt(j) == 'U')
                        count++;
                }
                System.out.print(Math.floorMod((arr[i] - count), 10) + " ");
            }
            System.out.println();
        }
    }
}