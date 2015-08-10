/**
 * Created by TedHakcer on 2015/8/10 0010.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesfromSortedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null; //head可能为null
            int value = head.val;
            ListNode idx = head;
            ListNode next = head.next;
            for (; next != null; next = next.next) {
                if (next.val != value) {
                    idx.next = next;
                    idx = next;
                    value = next.val;
                } else {
                    idx.next = null; //处理[1,1]的情况
                }
            }
            return head;
        }
    }
}
