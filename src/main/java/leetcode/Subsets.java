package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/subsets/
 */
public class Subsets {
    public class Solution {
        private List<List<Integer>> list;
        private int[] temp;

        private void dfs(int[] S, int deep, int idx, int tempIdx) {
            if (deep == idx) {
                List<Integer> tempList = new ArrayList<Integer>();
                for (int i = 0; i < tempIdx; ++i) {
                    tempList.add(temp[i]);
                }
                list.add(tempList);
                return;
            }
            dfs(S, deep, idx + 1, tempIdx);
            temp[tempIdx] = S[idx];
            dfs(S, deep, idx + 1, tempIdx + 1);
        }

        public List<List<Integer>> subsets(int[] S) {
            if (S == null) return null;
            list = new ArrayList<List<Integer>>();
            Arrays.sort(S);
            int len = S.length;
            temp = new int[len];
            dfs(S, len, 0, 0);
            return list;
        }
    }
}
