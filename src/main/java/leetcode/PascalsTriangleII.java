package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TedHakcer on 2015/8/16 0016.
 * https://leetcode.com/problems/pascals-triangle-ii/
 */
public class PascalsTriangleII {
    public class Solution {
        public List<Integer> getRow(int rowIndex) {
            if (rowIndex < 0) return null;
            int[] nums = new int[rowIndex + 1];
            for (int i = 0, a, b; i <= rowIndex; ++i) {
                a = 1;//a和b是中间变量
                for (int j = 0; j <= i; ++j) {
                    if (j == 0) {
                        nums[j] = 1;
                    } else if (j == i) {
                        nums[j] = 1;
                        nums[j - 1] = a;
                    } else {
                        b = nums[j - 1] + nums[j];
                        nums[j - 1] = a;
                        a = b;
                    }
                }
            }
            List<Integer> res = new ArrayList<Integer>();
            for (int i = 0; i <= rowIndex; ++i) {
                res.add(nums[i]);
            }
            return res;
        }
    }
}
