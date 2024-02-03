
/*
Question:
    A. Log Chopping
        There are 𝑛 logs, the 𝑖 -th log has a length of 𝑎𝑖 meters. Since chopping logs is tiring work, errorgorn and maomao90 have decided to play a game.
        errorgorn and maomao90 will take turns chopping the logs with errorgorn chopping first. On his turn, the player will pick a log and chop it into 2
        pieces. If the length of the chosen log is 𝑥, and the lengths of the resulting pieces are 𝑦and 𝑧, then 𝑦 and 𝑧
        have to be positive integers, and 𝑥=𝑦+𝑧 must hold. For example, you can chop a log of length 3 into logs of lengths 2 and 1, but not into logs of lengths 3 and 0, 2 and 2, or 1.5 and 1.5.
        The player who is unable to make a chop will be the loser. Assuming that both errorgorn and maomao90 play optimally, who will be the winner?

Link:
    https://codeforces.com/problemset/problem/1672/A

Solved on:
    13-01-2024

Input
    Each test contains multiple test cases. The first line contains a single integer 𝑡
    (1≤𝑡≤100)  — the number of test cases. The description of the test cases follows.
    The first line of each test case contains a single integer 𝑛
    (1≤𝑛≤50)  — the number of logs.
    The second line of each test case contains 𝑛
    integers 𝑎1,𝑎2,…,𝑎𝑛(1≤𝑎𝑖≤50)  — the lengths of the logs.
    Note that there is no bound on the sum of 𝑛
    over all test cases.

Output
    t case, print "errorgorn" if errorgorn wins or "maomao90" if maomao90 wins. (Output without quotes).

Example
    input
        2
        4
        2 4 2 1
        1
        1
    output
        errorgorn
        maomao90

*/
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- != 0) {
            int even = 0;
            int n = sc.nextInt();
            while (n-- != 0) {
                if (sc.nextInt() % 2 == 0)
                    even++;
            }
            System.out.println(even % 2 == 0 ? "maomao90" : "errorgorn");
        }
    }
}