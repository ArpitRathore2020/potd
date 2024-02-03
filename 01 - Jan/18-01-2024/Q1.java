class Solution {
    public int divisorSubstrings(int num, int k) {
        int i = 0;
        int j = 0;
        String numS = Integer.toString(num);
        int n = numS.length();
        int count = 0;
        StringBuilder w = new StringBuilder("");
        while (j < n) {
            w.append(numS.charAt(j));
            if (j - i + 1 < k)
                j++;
            else {
                int val = Integer.valueOf(w.toString());
                if (val != 0 && num % val == 0)
                    count++;
                w.deleteCharAt(0);
                i++;
                j++;
            }
        }
        return count;
    }
}