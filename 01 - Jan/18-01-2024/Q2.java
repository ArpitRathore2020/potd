import java.util.*;

class Solution {
    public int maxConsecutiveAnswers(String answerKeyStr, int k) {
        char answerKey[] = answerKeyStr.toCharArray();
        HashSet<Integer> hs = new HashSet<>();
        int i = 0;
        int j = 0;
        int n = answerKey.length;
        int ans = 0;
        i = 0;
        j = 0;
        while (j < n) {
            if (answerKey[j] == 'T')
                hs.add(j);
            if (hs.size() <= k)
                ans = Math.max(ans, j++ - i + 1);
            else
                hs.remove(i++);
        }
        i = 0;
        j = 0;
        hs = new HashSet<>();
        while (j < n) {
            if (answerKey[j] == 'F')
                hs.add(j);
            if (hs.size() <= k)
                ans = Math.max(ans, j++ - i + 1);
            else
                hs.remove(i++);
        }
        return ans;
    }
}