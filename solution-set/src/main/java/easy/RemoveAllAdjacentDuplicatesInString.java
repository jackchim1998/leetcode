package easy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Jack
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        return usingPrimitiveArray(s);
    }

    private String usingPrimitiveArray(String s) {
        char[] chars = new char[s.length()];
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (idx > 0 && chars[idx - 1] == c)
                idx--;
            else
                chars[idx++] = c;
        }
        return String.valueOf(chars, 0, idx);
    }

    private String usingStack(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c)
                stack.pollFirst();
            else
                stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pollLast());
        return sb.toString();
    }
}
