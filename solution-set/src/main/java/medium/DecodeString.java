package medium;

import java.util.Deque;
import java.util.LinkedList;

public class DecodeString {
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Deque<StringBuilder> strDeque = new LinkedList<>();
        Deque<Integer> countDeque = new LinkedList<>();
        int len = s.length();
        int idx = 0;
        while (idx < len) {
            char c = s.charAt(idx);
            if (Character.isDigit(c)) {
                int count = 0;
                while (idx < len && Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countDeque.push(count);
            } else if (c == '[') {
                strDeque.push(result);
                result = new StringBuilder();
                idx++;
            } else if (c == ']') {
                StringBuilder tmp = strDeque.pop();
                int repeatTimes = countDeque.pop();
                tmp.append(result.toString().repeat(Math.max(0, repeatTimes)));
                result = tmp;
                idx++;
            } else {
                result.append(c);
                idx++;
            }
        }
        return result.toString();
    }
}
