package backtracking.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) { // bit-wise is so quick
        List<String> result = new ArrayList<>();
        generateParenthesis(result, 0, n, n, n);
        return result;
    }

    private void generateParenthesis(List<String> result, int code, int openLeave, int closeLeave, int n) {
        if (openLeave == 0 && closeLeave == 0) {
            result.add(format(code, n));
            return;
        }
        if (openLeave > 0 && closeLeave >= openLeave - 1)
            generateParenthesis(result, (code << 1) + 1, openLeave - 1, closeLeave, n);
        if (closeLeave - 1 >= openLeave)
            generateParenthesis(result, code << 1, openLeave, closeLeave - 1, n);
    }

    private String format(int code, int n) {
        StringBuilder sb = new StringBuilder(n * 2);
        for (int i = 0; i < n * 2; i++) {
            sb.append((code & 1) == 0 ? '(' : ')');
            code >>= 1;
        }
        return sb.toString();
    }

//    public List<String> generateParenthesis(int n) {
//        List<String> result = new ArrayList<>();
//        StringBuilder sb = new StringBuilder(n * 2);
//        generateParenthesis(result, sb, n, n);
//        return result;
//    }
//
//    private void generateParenthesis(List<String> result, StringBuilder sb, int openLeave, int closeLeave) {
//        if (openLeave == 0 && closeLeave == 0) {
//            result.add(sb.toString());
//            return;
//        }
//        if (openLeave > 0 && closeLeave >= openLeave - 1) {
//            StringBuilder builder = new StringBuilder(sb.toString()).append('(');
//            generateParenthesis(result, builder, openLeave - 1, closeLeave);
//        }
//        if (closeLeave - 1 >= openLeave) {
//            StringBuilder builder = new StringBuilder(sb.toString()).append(')');
//            generateParenthesis(result, builder, openLeave, closeLeave - 1);
//        }
//    }
}
