package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    public class Solution {
        public int searchInsert(int[] A, int target) {
            int len = A.length;
            for (int i = 0; i < len; ++i) {
                if (A[i] >= target) return i;
            }
            return len;
        }
    }
}
