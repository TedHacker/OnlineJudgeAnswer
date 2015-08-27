package CodingInterviews;

/**
 * 二维数组中的查找
 * Created by qinjuntao on 2015/8/27.
 */
public class Find {
    public class Solution {
        public boolean Find(int[][] array, int target) {
            if (array == null) return false;
            int n = array.length;
            int m = array[0].length;
            int x = 0;
            int y = m - 1;
            for (; x < n && 0 <= y; ) {
                if (target > array[x][y]) ++x;
                else if (target < array[x][y]) --y;
                else return true;
            }
            return false;
        }
    }

}
