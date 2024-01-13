/*
Question:
    A. Insert Digit
    You have a positive number of length 𝑛 and one additional digit.
    You can insert this digit anywhere in the number, including at the beginning or at the end.
    Your task is to make the result as large as possible.
    For example, you have the number 76543, and the additional digit is 4.
        Then the maximum number you can get is 765443, and it can be obtained in two ways — 
            (1) by inserting a digit after the 3th or 
            (2) after the 4th digit of the number.

Solved on:
    12-01-2024

Link:
    https://codeforces.com/contest/1811/problem/A

Input
        The first line contains a single integer 𝑡(1≤𝑡≤104) — the number of test cases.
        The descriptions of the test cases follow.
        The first line of the description of each test case contains two integers 𝑛and 𝑑(1≤𝑛≤2⋅105; 0≤𝑑≤9) — the length of the number and an additional digit, respectively.
        The second line of the description of each test case contains a string consisting of 𝑛 digits — the number that you have initially. 
        It is guaranteed that the number does not contain leading zeros.
        It is guaranteed that the sum of 𝑛 for all test cases does not exceed 2⋅105.

Output
    For each test case, output a string consisting of 𝑛+1 digits — the maximum possible number that can be obtained.

Example
    input
        11
        5 4
        76543
        1 0
        1
        2 5
        44
        3 6
        666
        5 6
        13579
        5 8
        97531
        19 4
        9876543210123456789
        5 7
        73737
        8 1
        20000000
        7 0
        7058959
        12 1
        828127127732
    output
        765443
        10
        544
        6666
        613579
        987531
        98765443210123456789
        773737
        210000000
        70589590
        8281271277321
*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        // 13579 6

        while (tt-- != 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            String s = sc.next();
            int i;
            for (i = 0; i < n; i++) {
                if (Integer.parseInt(s.substring(i, i + 1)) < d)
                    break;
            }
            s = s.substring(0, i) + d + s.substring(i, n);
            System.out.println(s);
        }
    }
}