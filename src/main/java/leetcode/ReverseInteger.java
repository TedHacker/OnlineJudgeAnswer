package leetcode;

/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {
    public class Solution {
        public int reverse(int x) {
            int summ = 0;
            for (; x != 0; x /= 10) {
                if (summ * 10 / 10 != summ) return 0; //如果溢出，返回0
                summ = summ * 10 + x % 10;
            }
            return summ;
        }
    }
}
