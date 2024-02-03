
/*
Question:
    A. String Task
        Petya started to attend programming lessons. On the first lesson, his task was to write a simple program. The program was supposed to do the following in the given string, consisting of uppercase and lowercase Latin letters:
            - Deletes all the vowels.
            - Inserts a character "." before each consonant.
            - Replaces all uppercase consonants with corresponding lowercase ones.
        The program's input is exactly one string, and it should return the output as a single string resulting after processing the initial string.

Link:
    https://codeforces.com/problemset/problem/118/A

Solved on:
    14-01-2024

Input:
    - The first line represents the input string of Petya's program.
    - This string only consists of uppercase and lowercase Latin letters.
    - The length of the string is from 1 to 100, inclusive.

Output:
    - Print the resulting string.
    - It is guaranteed that this string is not empty.

Examples:
    1. 
    - Input: tour
    - Output: .t.r

    2.
    - Input: Codeforces
    - Output: .c.d.f.r.c.s

    3.
    - Input: aBAcAba
    - Output: .b.c.b

Constraints:
    - Time limit per test: 2 seconds
    - Memory limit per test: 256 megabytes

*/
import java.util.Scanner;

public class Q2 {
    public static boolean isVowel(char c) {
        c = Character.toUpperCase(c);
        return (c == 'A' || c == 'O' || c == 'Y' || c == 'E' || c == 'U' || c == 'I');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder("");
        char c[] = sc.next().toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (!isVowel(c[i]))
                ans.append("." + Character.toLowerCase(c[i]));
        }
        System.out.println(ans);
    }
}