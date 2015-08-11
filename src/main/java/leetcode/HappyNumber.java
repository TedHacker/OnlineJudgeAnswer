package leetcode;

import java.util.HashSet;

/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {
    public class Solution {
        private int calculate(int num) {
            int summ = 0;
            for (; num > 0; num /= 10) {
                summ += (num % 10) * (num % 10);
            }
            return summ;
        }

        public boolean isHappy(int n) {
            HashSet<Integer> hs = new HashSet<Integer>();
            for (; ; ) {
                hs.add(n);
                n = calculate(n);
                if (n == 1) {
                    return true;
                }
                if (hs.contains(n)) {
                    return false;
                }
            }
        }
    }
}
