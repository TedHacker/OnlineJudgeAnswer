package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 */
public class FactorialTrailingZeroes {
    public class Solution {
        public int trailingZeroes(int n) {
            long x = 5;
            int ans = 0;
            for (; x <= (long) n; x *= 5) {
                ans += (n / x);
            }
            return ans;
        }
    }
}
