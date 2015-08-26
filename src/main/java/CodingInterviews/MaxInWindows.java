package CodingInterviews;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by qinjuntao on 2015/8/26.
 */
public class MaxInWindows {
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

        public ArrayList<Integer> maxInWindows(int[] num, int size) {
            ArrayList<Integer> res = new ArrayList<Integer>();
            if (num == null || num.length < 1 || size == 0) return res;//会有[], 0这样的输入
            Queue<Node> priorityQueue = new PriorityQueue<Node>(size + 1);
            int i = 0;
            for (i = 0; i < size - 1; ++i)
                priorityQueue.add(new Node(i, num[i]));
            for (; i < num.length; ++i) {
                priorityQueue.add(new Node(i, num[i]));
                for (; i - priorityQueue.peek().getIndex() >= size; priorityQueue.poll()) ;
                res.add(priorityQueue.peek().getValue());
            }
            return res;
        }
    }
}
