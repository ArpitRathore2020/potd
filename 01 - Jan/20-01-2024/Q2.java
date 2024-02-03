import java.util.*;

class Solution {
    public boolean checkInclusion(String ss1, String ss2) {
        char s1[] = ss1.toCharArray();
        char s2[] = ss2.toCharArray();
        int n = s2.length;
        HashMap<Character, Integer> f = new HashMap<>();
        HashMap<Character, Integer> s = new HashMap<>();
        for (int i = 0; i < s1.length; i++)
            f.put(s1[i], f.getOrDefault(s1[i], 0) + 1);
        int i = 0;
        int j = 0;
        while (j < n) {
            s.put(s2[j], s.getOrDefault(s2[j], 0) + 1);
            if (j - i + 1 < s1.length)
                j++;
            else {
                if (f.equals(s))
                    return true;
                s.put(s2[i], s.get(s2[i]) - 1);
                if (s.get(s2[i]) == 0)
                    s.remove(s2[i]);
                i++;
                j++;
            }
        }
        return false;
    }
}