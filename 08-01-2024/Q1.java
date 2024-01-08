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

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int time = 0;
        int i = 0;
        while (i < n) {
            int sum = 0;
            int max = neededTime[i];
            int j = i;
            while (j < n && colors.charAt(i) == colors.charAt(j)) {
                sum += neededTime[j];
                if (max < neededTime[j])
                    max = neededTime[j];
                ++j;
            }
            time += (sum - max);
            i = j;
        }
        return time;
    }
}