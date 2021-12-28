package medium;

import java.util.Deque;
import java.util.LinkedList;

public class BasicCalculatorII {
    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        int len = s.length();
        Deque<Integer> stack = new LinkedList<>();
        int num = 0;
        char operation = '+';
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                num = (num * 10) + (c - '0');
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == len - 1) {
                if (operation == '-')
                    stack.push(-num);
                else if (operation == '+')
                    stack.push(num);
                else if (operation == '*')
                    stack.push(stack.pop() * num);
                else if (operation == '/')
                    stack.push(stack.pop() / num);
                operation = c;
                num = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty())
            result += stack.pop();
        return result;
    }
}
