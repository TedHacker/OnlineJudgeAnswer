package leetcode;

/**
 * Created by TedHakcer on 2015/8/14 0014.
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerofTwo {
    public class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n < 0) return false;
            boolean flag = false;
            for (int i = 0; i < 31; ++i) {
                if (((n >> i) & 1) == 1) {
                    if (flag) {
                        return false;
                    } else {
                        flag = true;
                    }
                }
            }
            return flag;
        }
    }
}
