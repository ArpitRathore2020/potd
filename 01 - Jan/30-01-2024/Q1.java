class Solution {
    public int arrangeCoins(int n) {
        long i = 1;
        long j = n;
        long ans = 1;
        while (i <= j) {
            long mid = i + (j - i) / 2;
            long val = mid * (mid + 1) / 2;
            if (val == n)
                return (int) mid;
            if (val < n) {
                ans = mid;
                i = mid + 1;
            } else
                j = mid - 1;
        }
        return (int) ans;
    }
}