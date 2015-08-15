package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/maximum-gap/
 */
public class MaximumGap {
    public class Solution {
        class Bucket {
            public int max, min;

            public Bucket() {
                this.max = Integer.MIN_VALUE;
                this.min = Integer.MAX_VALUE;
                ;
            }

            public Bucket(int x) {
                this.max = this.min = x;
            }
        }

        public int maximumGap(int[] num) {
            if (num == null || num.length < 2) return 0;
            if (num.length == 2) return num[0] - num[1] > 0 ? num[0] - num[1] : num[1] - num[0];
            int len = num.length;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < len; ++i) {
                if (num[i] > max) max = num[i];
                if (num[i] < min) min = num[i];
            }
            int gap = (max - min) / (len - 1) + 1;
            Bucket[] buckets = new Bucket[(max - min) / gap + 1];
            for (int i = 0, idx; i < len; ++i) {
                idx = (num[i] - min) / gap;
                if (buckets[idx] == null) {
                    buckets[idx] = new Bucket(num[i]);
                } else if (buckets[idx].max < num[i]) {
                    buckets[idx].max = num[i];
                } else if (buckets[idx].min > num[i]) {
                    buckets[idx].min = num[i];
                }
            }
            int pre = 0, maxGap = Integer.MIN_VALUE;
            for (int i = 1; i < buckets.length; ++i) {
                if (buckets[i] != null) {
                    if (maxGap < (buckets[i].min - buckets[pre].max)) {
                        maxGap = buckets[i].min - buckets[pre].max;
                    }
                    pre = i;
                }
            }
            return maxGap;
        }
    }
}
