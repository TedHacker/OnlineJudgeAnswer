package leetcode;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/count-and-say/
 */
public class CountandSay {
    public class Solution {
        private String nextSequence(String s) {
            StringBuilder builder = new StringBuilder();
            int counts = 0;
            char first = s.charAt(0);
            for (int i = 0; i < s.length(); ++i) {
                if (first == s.charAt(i)) {
                    ++counts;
                } else {
                    builder.append(String.valueOf(counts));
                    builder.append(String.valueOf(first));
                    first = s.charAt(i);
                    counts = 1;
                }
            }
            builder.append(String.valueOf(counts));
            builder.append(String.valueOf(first));
            return builder.toString();
        }

        public String countAndSay(int n) {
            if (n < 1) return null;
            String answer = "1";
            for (int i = 1; i < n; ++i) {
                answer = nextSequence(answer);
            }
            return answer;
        }
    }
}
