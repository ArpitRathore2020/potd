/*
Question:  
    B. File Name
    You can not just take the file and send it. When Polycarp trying to send a file in the social network "Codehorses", he encountered an unexpected problem. 
    If the name of the file contains three or more "x" (lowercase Latin letters "x") in a row, the system considers that the file content does not correspond to the social network topic. 
    In this case, the file is not sent and an error message is displayed.
    Determine the minimum number of characters to remove from the file name so after that the name does not contain "xxx" as a substring. Print 0 if the file name does not initially contain a forbidden substring "xxx".
    You can delete characters in arbitrary positions (not necessarily consecutive). If you delete a character, then the length of a string is reduced by 1.
    For example, if you delete the character in the position 2 from the string "exxxii", then the resulting string is "exxii".

Solved on:
    11-01-2024

Link:
    https://codeforces.com/problemset/problem/978/B

Input
    The first line contains integer 𝑛(3≤𝑛≤100)— the length of the file name.    
    The second line contains a string of length 𝑛 consisting of lowercase Latin letters only — the file name.

Output
    Print the minimum number of characters to remove from the file name so after that the name does not contain "xxx" as a substring. If initially the file name dost not contain a forbidden substring "xxx", print 0.

Examples
    input
        6
        xxxiii
    Output
        1

*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char s[] = sc.next().toCharArray();
        int ans = 0;
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && s[j] == s[i])
                j++;
            if (s[i] == 'x')
                ans += Math.max(0, j - i - 2);
            i = j;
        }
        System.out.println(ans);
    }
}