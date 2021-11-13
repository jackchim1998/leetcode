package medium;

import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Element> stack = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek().val < temperatures[i]) {
                Element ele = stack.pop();
                result[ele.idx] = i - ele.idx;
            }
            stack.push(new Element(temperatures[i], i));
        }

        return result;
    }

    private static final class Element {
        private final int val;
        private final int idx;

        private Element(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }
}
