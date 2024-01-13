
/*
Question:
    B. Karina and Array
    Karina has an array of 𝑛 integers 𝑎1,𝑎2,𝑎3,…,𝑎𝑛
    She loves multiplying numbers, so she decided that the beauty of a pair of numbers is their product. 
    And the beauty of an array is the maximum beauty of a pair of adjacent elements in the array.
        For example, for 𝑛=4, 𝑎=[3,5,7,4], the beauty of the array is max
            (3⋅5, 5⋅7, 7⋅4) = max(15, 35, 28) = 35.
    Karina wants her array to be as beautiful as possible. In order to achieve her goal, she can remove some elements (possibly zero) from the array. 
    After Karina removes all elements she wants to, the array must contain at least two elements.
    Unfortunately, Karina doesn't have enough time to do all her tasks, so she asks you to calculate the maximum beauty of the array that she can get by removing any number of elements (possibly zero).

Solved on:
    12-01-2024

Link:
    https://codeforces.com/contest/1822/problem/B

Input
    The first line of the input contains an integer 𝑡
    (1≤𝑡≤104) — the number of test cases.
    The description of the test cases follows.
    The first line of a test case contains an integer 𝑛(2≤𝑛≤2⋅105) — the length of the array 𝑎.
    The second line of a test case contains 𝑛 integers 𝑎1,𝑎2,𝑎3,…,𝑎𝑛(−10^9≤𝑎𝑖≤10^9) — the elements of the array 𝑎.
    The sum of all values of 𝑛 across all test cases does not exceed 2⋅10^5.

Output
Output 𝑡 integers, each of which is the answer to the corresponding test case — the maximum beauty of the array that Karina can get.

Example
    input
        7
        4
        5 0 2 1
        3
        -1 1 0
        5
        2 0 -1 -4 0
        6
        -8 4 3 7 1 -9
        6
        0 3 -2 5 -4 -4
        2
        1000000000 910000000
        7
        -1 -7 -2 -5 -4 -6 -3
    output
        10
        0
        4
        72
        16
        910000000000000000
        42


*/
import java.util.*;

public class Q1 {

    public class B_Karina_and_Array {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tt = sc.nextInt();
            while (tt-- != 0) {
                int n = sc.nextInt();
                long first = sc.nextLong();
                Long firstMax = first;
                Long secondMax = null;
                Long firstMin = first;
                Long secondMin = null;
                for (int i = 0; i < n - 1; i++) {
                    Long temp = sc.nextLong();
                    if (temp >= firstMax) {
                        secondMax = firstMax;
                        firstMax = temp;
                    } else if (secondMax == null || temp >= secondMax)
                        secondMax = temp;

                    if (temp <= firstMin) {
                        secondMin = firstMin;
                        firstMin = temp;
                    } else if (secondMin == null || temp <= secondMin)
                        secondMin = temp;
                }
                System.out.println(Math.max(firstMax * secondMax, firstMin * secondMin));
            }
        }
    }
}
