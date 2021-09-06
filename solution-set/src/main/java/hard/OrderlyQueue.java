package hard;

import java.util.Arrays;

public class OrderlyQueue {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String min = s;
            String curr = s;
            for (int i = 0; i < s.length(); i++) {
                curr = curr.substring(1, s.length()) + curr.charAt(0);
                if (curr.compareTo(min) < 0)
                    min = curr;
            }
            return min;
        } else {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return String.valueOf(chars);
        }
    }
}
