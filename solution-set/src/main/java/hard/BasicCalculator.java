package hard;

public class BasicCalculator {
    private int idx = 0;

    public int calculate(String s) {
        idx = 0;
        return eval(s.toCharArray());
    }

    private int eval(char[] chars) {
        int result = 0;
        boolean isPositive = true;
        while (idx < chars.length) {
            if (chars[idx] == '(') {
                idx++;
                int val = eval(chars);
                result += isPositive ? val : -val;
            } else if (chars[idx] == ')') {
                idx++;
                return result;
            } else if (chars[idx] == '-') {
                idx++;
                isPositive = false;
            } else if (chars[idx] == ' ') {
                idx++;
            } else if (chars[idx] == '+') {
                isPositive = true;
                idx++;
            } else {
                int val = extractVal(chars);
                result += isPositive ? val : -val;
            }
        }
        return result;
    }

    private int extractVal(char[] chars) {
        int result = 0;
        while (idx < chars.length && chars[idx] >= '0' && chars[idx] <= '9')
            result = result * 10 + chars[idx++] - '0';
        return result;
    }

}
