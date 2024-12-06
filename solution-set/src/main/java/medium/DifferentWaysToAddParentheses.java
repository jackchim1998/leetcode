package medium;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
    /*
    a b c d
    a (b c d)
    (a b) (c d)
    (a b c) d
     */
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();

        char[] chars = expression.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            boolean add = chars[i] == '+';
            boolean reduce = chars[i] == '-';
            boolean multi = chars[i] == '*';
            if (add || reduce || multi) {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (Integer l : left) {
                    for (Integer r : right) {
                        if (add) {
                            result.add(l + r);
                        } else if (reduce) {
                            result.add(l - r);
                        } else {
                            result.add(l * r);
                        }
                    }
                }
            }
        }
        if (result.size() == 0) {
            result.add(Integer.valueOf(expression));
        }
        return result;
    }
}
