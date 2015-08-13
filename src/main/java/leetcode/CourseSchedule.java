package leetcode;

import java.util.ArrayList;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/course-schedule/
 * 拓扑排序
 */
public class CourseSchedule {
    public class Solution {
        class Node {
            public int inNum;//入度
            public ArrayList<Integer> nextNode;//后续结点列表
            public boolean flag;//是否处理过

            public Node() {
                inNum = 0;
                flag = false;
                nextNode = new ArrayList<Integer>();
            }
        }

        public boolean canFinish(int numCourses, int[][] prerequisites) {
            Node[] nodeList = new Node[numCourses];
            for (int i = 0; i < numCourses; ++i)
                nodeList[i] = new Node();
            for (int i = 0; i < prerequisites.length; ++i) {
                for (int j = 0; j < prerequisites[i].length; ++j) {
                    if (i == prerequisites[i][j]) return false;//出现自回路
                    nodeList[i].nextNode.add(prerequisites[i][j]);
                    ++nodeList[prerequisites[i][j]].inNum;
                }
            }
            int remain = numCourses;
            int idx = 0;
            for (boolean flag = true; remain > 0; flag = true) {
                for (int i = 0; i < numCourses; ++i) {
                    if (nodeList[i].inNum == 0 && (!nodeList[i].flag)) {
                        idx = i;
                        --remain;
                        flag = false;
                        break;
                    }
                }
                if (flag && remain > 0) return false;
                nodeList[idx].flag = true;
                for (int i = 0; i < nodeList[idx].nextNode.size(); ++i) {
                    --nodeList[nodeList[idx].nextNode.get(i)].inNum;
                }
            }
            return true;
        }
    }
}
