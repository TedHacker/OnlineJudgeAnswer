/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            ListNode root = null;
            ListNode index = null;
            for (; l1 != null && l2 != null; ) {
                if (root == null) {
                    if (l1.val < l2.val) {
                        root = l1;
                        l1 = l1.next;
                    } else {
                        root = l2;
                        l2 = l2.next;
                    }
                    index = root;
                } else {
                    if (l1.val < l2.val) {
                        index.next = l1;
                        index = l1;
                        l1 = l1.next;
                    } else {
                        index.next = l2;
                        index = l2;
                        l2 = l2.next;
                    }
                }
                index.next = null;
            }
            if (l1 != null) index.next = l1;
            if (l2 != null) index.next = l2;
            return root;
        }
    }
}
