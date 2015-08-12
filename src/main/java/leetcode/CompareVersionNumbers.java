package leetcode;

/**
 * Created by qinjuntao on 2015/8/12.
 * https://leetcode.com/problems/compare-version-numbers/
 */
public class CompareVersionNumbers {
    public class Solution {
        public int compareVersion(String version1, String version2) {
            String[] a = version1.split("\\.");//Òª×ªÒå
            String[] b = version2.split("\\.");
            int idx = 0;
            for (; idx < a.length && idx < b.length; ++idx) {
                if (Integer.valueOf(a[idx]) > Integer.valueOf(b[idx]))
                    return 1;
                if (Integer.valueOf(a[idx]) < Integer.valueOf(b[idx]))
                    return -1;
            }
            for (; idx < a.length; ++idx) {
                if (Integer.valueOf(a[idx]) > 0) return 1;
            }
            for (; idx < b.length; ++idx) {
                if (Integer.valueOf(b[idx]) > 0) return -1;
            }
            return 0;
        }
    }
}
