class Solution {
    public String is_palindrome(int n) {
        String s = Integer.toString(n);
        return s.equals(new StringBuilder(s).reverse().toString()) ? "Yes" : "No";
    }
}