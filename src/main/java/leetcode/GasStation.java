package leetcode;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/gas-station/
 */
public class GasStation {
    public class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            if (gas == null || cost == null) return -1;
            int sum = 0;
            int len = gas.length;
            for (int i = 0; i < len; ++i) {
                sum = gas[i] - cost[i];
                if (sum >= 0) {
                    for (int j = (i + 1) % len; ; j = (j + 1) % len) {
                        sum += (gas[j] - cost[j]);
                        if (sum < 0) {
                            if (j < i) return -1;
                            else {
                                i = j;
                                break;
                            }
                        }
                        if (i == j) return i;
                    }
                }
            }
            return -1;
        }
    }
}
