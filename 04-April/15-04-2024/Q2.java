
class Solution {
    long countStrings(int n) {
        long mod = 1_000_000_007;
        long zero = 1;
        long one = 1;
        long newZero, newOne;
        for (int i = 2; i <= n; i++) {
            newZero = zero + one;
            newOne = zero;
            zero = newZero % mod;
            one = newOne % mod;
        }
        return (one + zero) % mod;
    }
}

// Time : O(n)
// Space: O(1)