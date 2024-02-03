import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String ss, String pp) {
        char s[] = ss.toCharArray();
        char p[] = pp.toCharArray();
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> pat = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < p.length; i++)
            pat.put(p[i], pat.getOrDefault(p[i], 0) + 1);
        int i = 0;
        int j = 0;
        int k = p.length;
        int n = s.length;
        while (j < n) {
            window.put(s[j], window.getOrDefault(s[j], 0) + 1);
            if (j - i + 1 < k) {
                j++;
            } else {
                if (pat.equals(window))
                    ans.add(i);
                window.put(s[i], window.get(s[i]) - 1);
                if (window.get(s[i]) == 0)
                    window.remove(s[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}