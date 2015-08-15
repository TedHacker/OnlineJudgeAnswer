package leetcode;

import java.util.HashSet;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class LinkedListCycleII {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null) return null;
            HashSet<String> set = new HashSet<String>();
            for (ListNode i = head; i != null; i = i.next) {
                if (!set.contains(i.toString())) set.add(i.toString());
                else return i;
            }
            return null;
        }
    }
}
