package easy;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                Character lastOpenParentheses = stack.pop();
                if (lastOpenParentheses == '(' && c != ')' || lastOpenParentheses == '[' && c != ']' || lastOpenParentheses == '{' && c != '}')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
