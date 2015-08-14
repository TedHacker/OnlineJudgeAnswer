package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/rectangle-area/
 */
public class RectangleArea {
    public class Solution {
        public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
            int a = Math.max(A, E);
            int b = Math.max(B, F);
            int c = Math.min(C, G);
            int d = Math.min(D, H);
            if (a < c && b < d) {
                return (c - a) * (d - b);
            } else {
                return 0;
            }
        }
    }
}
