package leetcode;

/**
 * Created by qinjuntao on 2015/8/12.
 * https://leetcode.com/problems/compare-version-numbers/
 */
public class CompareVersionNumbers {
    public class Solution {
        public int compareVersion(String version1, String version2) {
            String[] a = version1.split(".");
            String[] b = version2.split(".");
            return Integer.valueOf(a[0]).compareTo(Integer.valueOf(b[0])) == 0 ? Integer.valueOf(a[1]).compareTo(Integer.valueOf(b[1])) : Integer.valueOf(a[0]).compareTo(Integer.valueOf(b[0]));
        }
    }
}
