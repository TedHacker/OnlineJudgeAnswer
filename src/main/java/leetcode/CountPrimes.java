package leetcode;

import java.util.Arrays;

/**
 * Created by qinjuntao on 2015/8/12.
 * https://leetcode.com/problems/count-primes/
 */
public class CountPrimes {
    public class Solution {
        public int countPrimes(int n) {
            if (n < 2) return 0;
            boolean[] primes = new boolean[n + 1];
            Arrays.fill(primes, true);
            primes[0] = primes[1] = false;
            int end = (int) (Math.sqrt(n) + 1);
            for (int i = 0; i <= end; ++i) {
                if (primes[i]) {
                    for (int j = 2; i * j <= n; ++j) {
                        primes[i * j] = false;
                    }
                }
            }
            int counts = 0;
            for (int i = 0; i < n; ++i) { //Count the number of prime numbers less than a non-negative number, n.
                if (primes[i]) {
                    ++counts;
                }
            }
            return counts;
        }
    }
}
