package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/powx-n/
 * ¿ìËÙÃÝ³Ë
 */
public class Powxn {
    public class Solution {
        public double pow(double x, int n) {
            if (n < 0) {
                if (n == Integer.MIN_VALUE)
                    return 1.0 / (pow(x, Integer.MAX_VALUE) * x);
                else
                    return 1.0 / pow(x, -n);
            }
            double ans = 1.0;
            if (n == 0)
                return ans;
            for (; n > 0; x *= x, n >>= 1) {
                if ((n & 1) > 0)
                    ans *= x;
            }
            return ans;
        }
    }
}
