package leetcode;

/**
 * Created by TedHakcer on 2015/8/11 0011.
 * https://leetcode.com/problems/path-sum/
 */
public class PathSum {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public class Solution {
        private boolean flag=false;
        private void dfs(TreeNode root,int sum,int now){
            if(root==null) return;
            if(root.left==null&&root.right==null){
                if(now+root.val==sum){
                    flag=true;
                }
                return;
            }
            dfs(root.left,sum,now+root.val);
            dfs(root.right,sum,now+root.val);
        }
        public boolean hasPathSum(TreeNode root, int sum) {
            dfs(root,sum,0);
            return flag;
        }
    }
}
