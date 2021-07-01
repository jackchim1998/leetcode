package medium;

/**
 * @author Jack
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length / 2 + 1];
        int pos = 0;
        for (String token : tokens) {
            if (token.equals("+")) {
                stack[pos - 2] += stack[pos - 1];
                pos--;
            } else if (token.equals("-")) {
                stack[pos - 2] -= stack[pos - 1];
                pos--;
            } else if (token.equals("*")){
                stack[pos - 2] *= stack[pos - 1];
                pos--;
            }else if (token.equals("/")){
                stack[pos - 2] /= stack[pos - 1];
                pos--;
            }else {
                stack[pos] = Integer.parseInt(token);
                pos++;
            }
        }
        return stack[0];
    }
}
