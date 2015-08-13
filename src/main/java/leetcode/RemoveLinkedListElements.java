package leetcode;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class RemoveLinkedListElements {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode removeElements(ListNode head, int val) {
            for (; head != null && head.val == val; head = head.next) ;
            if (head == null) return head;
            ListNode idx = head;
            for (ListNode tmp = idx; idx != null && idx.next != null; idx = idx.next) {
                for (tmp = idx; tmp.next != null && tmp.next.val == val; tmp=tmp.next) ;
                idx.next = tmp.next;
            }
            return head;
        }
    }
}
