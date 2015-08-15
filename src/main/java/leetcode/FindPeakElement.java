package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/find-peak-element/
 */
public class FindPeakElement {
    public class Solution {
        public int findPeakElement(int[] num) {
            if (num == null) return 0;
            int len = num.length;
            if (len == 1 || num[0] > num[1]) return 0;
            for (int i = 1; i < len - 1; ++i)
                if (i + 1 < len && num[i - 1] < num[i] && num[i] > num[i + 1])
                    return i;
            if (len - 2 >= 0 && num[len - 2] < num[len - 1])
                return len - 1;
            return 0;
        }
    }
}
