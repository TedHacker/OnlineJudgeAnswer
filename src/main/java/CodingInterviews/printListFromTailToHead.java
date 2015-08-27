package CodingInterviews;

import leetcode.PalindromeLinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * 从尾到头打印链表
 * Created by qinjuntao on 2015/8/27.
 */
public class printListFromTailToHead {
    public class Solution {

        public class ListNode {
            int val;
            ListNode next = null;

            ListNode(int val) {
                this.val = val;
            }
        }

        public ArrayList<Integer> res;
        public void dfs(ListNode root){
            if(root==null) return;
            dfs(root.next);
            res.add(root.val);
        }
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            res=new ArrayList<Integer>();
            dfs(listNode);
            return res;
        }
    }
}
