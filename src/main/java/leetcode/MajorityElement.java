package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public class Solution {
        public int majorityElement(int[] num) {
            int len = num.length;
            int count = 1;
            int major = num[0];
            for (int i = 1; i < len; ++i) {
                if (num[i] == major) ++count;
                else {
                    --count;
                    if (count < 0) {
                        major = num[i];
                        count = 1;
                    }
                }
            }
            return major;
        }
    }
}
