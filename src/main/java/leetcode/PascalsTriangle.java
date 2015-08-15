package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangle {
    public class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ll = new ArrayList<List<Integer>>(numRows);
            List<Integer> temp = null;
            List<Integer> temq = null;
            for (int i = 0; i < numRows; ++i) {
                if (i == 0) {
                    temp = new ArrayList<Integer>(1);
                    temp.add(1);
                    ll.add(temp);
                } else if (i == 1) {
                    temp = new ArrayList<Integer>(2);
                    temp.add(1);
                    temp.add(1);
                    ll.add(temp);
                } else {
                    temp = new ArrayList<Integer>(i + 1);
                    temq = ll.get(i - 1);
                    temp.add(1);
                    for (int j = 1; j < temq.size(); ++j) {
                        temp.add(temq.get(j - 1) + temq.get(j));
                    }
                    temp.add(1);
                    ll.add(temp);
                }
            }
            return ll;
        }
    }
}
