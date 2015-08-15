package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class Numberof1Bits {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int sum = 0;
            for (int i = 0; i < 32; ++i) {
                if ((n & 1) == 1) ++sum;
                n >>= 1;
            }
            return sum;
        }
    }
}
