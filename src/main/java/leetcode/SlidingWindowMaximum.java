package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by TedHakcer on 2015/8/16 0016.
 * https://leetcode.com/problems/sliding-window-maximum/
 */
public class SlidingWindowMaximum {
    public class Solution {
        class Node implements Comparable {
            private int index;
            private int value;

            public int getIndex() {
                return index;
            }

            public int getValue() {
                return value;
            }

            public Node(int index, int value) {
                this.index = index;
                this.value = value;
            }

            public int compareTo(Object o) {
                if (o instanceof Node) {
                    int value = ((Node) o).getValue();
                    return this.value == value ? 0 : (this.value > value ? -1 : 1);//注意排序顺序，详情见PriorityQueue源码
                } else {
                    throw new ClassCastException("Cannot compare Node with "
                            + o.getClass().getName());
                }
            }
        }

        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || nums.length < 1 || k == 0) return new int[0];//会有[], 0这样的输入
            int[] res = new int[nums.length - k + 1];
            Queue<Node> priorityQueue = new PriorityQueue<Node>(k + 1);
            int i = 0;
            for (i = 0; i < k - 1; ++i)
                priorityQueue.add(new Node(i, nums[i]));
            for (; i < nums.length; ++i) {
                priorityQueue.add(new Node(i, nums[i]));
                for (; i - priorityQueue.peek().getIndex() >= k; priorityQueue.poll()) ;
                res[i - k + 1] = priorityQueue.peek().getValue();
            }
            return res;
        }
    }
}
