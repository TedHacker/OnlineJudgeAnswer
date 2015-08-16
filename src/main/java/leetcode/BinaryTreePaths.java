package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TedHakcer on 2015/8/16 0016.
 * https://leetcode.com/problems/binary-tree-paths/
 */
public class BinaryTreePaths {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        List<String> res;
        List<Integer> nums;

        private void format() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < nums.size(); ++i) {
                if (i == 0) {
                    sb.append(nums.get(i));
                } else {
                    sb.append("->" + nums.get(i));
                }
            }
            res.add(sb.toString());
            return;
        }

        private void dfs(TreeNode root, int deep) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) { //到达叶子结点，生成路径
                nums.add(root.val);
                format();
                nums.remove(deep);
                return;
            }
            nums.add(root.val);
            dfs(root.left, deep + 1);
            dfs(root.right, deep + 1);
            nums.remove(deep);
        }

        public List<String> binaryTreePaths(TreeNode root) {
            res = new ArrayList<String>();
            nums = new ArrayList<Integer>();
            if (root == null) return res;
            dfs(root, 0);
            return res;
        }
    }
}
