package common;


import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class AssertUtil {
    public static <T> void assertEquals(List<List<T>> expected, List<List<T>> actual) {
        int n = expected.size();
        if (n != actual.size()) throw new AssertionFailedError(String.format("OutSide List length diff, expected: %d, actual: %d", n, actual.size()));
        for (int i = 0; i < n; i++)
            if (!expected.get(i).equals(actual.get(i)))
                throw new AssertionFailedError(String.format("Inside List not matched, expected: %s, actual: %s", expected.get(i), actual.get(i)));
    }

    public static void assertEquals(int[][] expected, int[][] actual) {
        int m = expected.length;
        if (m != actual.length) throw new AssertionFailedError(String.format("expected: %s actual: %s", toString(expected), toString(actual)));
        for (int i = 0; i < m; i++) {
            int n = expected[i].length;
            if (n != actual[i].length) throw new AssertionFailedError(String.format("expected: %s actual: %s", toString(expected), toString(actual)));
            for (int j = 0; j < n; j++)
                if (expected[i][j] != actual[i][j])
                    throw new AssertionFailedError(String.format("expected: %s actual: %s", toString(expected), toString(actual)));
        }
    }

    public static void assertEquals(char[][] expected, char[][] actual) {
        int m = expected.length;
        if (m != actual.length) throw new AssertionFailedError(String.format("expected: %s actual: %s", toString(expected), toString(actual)));
        for (int i = 0; i < m; i++) {
            int n = expected[i].length;
            if (n != actual[i].length) throw new AssertionFailedError(String.format("expected: %s actual: %s", toString(expected), toString(actual)));
            for (int j = 0; j < n; j++)
                if (expected[i][j] != actual[i][j])
                    throw new AssertionFailedError(String.format("expected: %s actual: %s", toString(expected), toString(actual)));
        }
    }

    private static String toString(int[][] matrix) {
        var sb = new StringBuilder().append('\n');
        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                if (j > 0) sb.append(',');
                sb.append(String.format("%2d", row[j]));
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    private static String toString(char[][] matrix) {
        var sb = new StringBuilder().append('\n');
        for (char[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                if (j > 0) sb.append(',');
                sb.append(String.format("%c", row[j]));
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static <T> void assertEqualsIgnoreOrders(List<List<T>> expected, List<List<T>> actual) {
        int n = expected.size();
        if (n != actual.size()) throw new AssertionFailedError(String.format("OutSide List length diff, expected: %d, actual: %d", n, actual.size()));
        for (List<T> expectedElement : expected) {
            boolean isActualExists = false;
            for (List<T> actualElement : actual)
                if (equalsIgnoreOrders(expectedElement, actualElement)) {
                    isActualExists = true;
                    break;
                }
            if (!isActualExists)
                throw new AssertionFailedError(String.format("Expected Inside List not matched, cannot find %s,\nactual: %s", expectedElement, actual));
        }
    }

    private static <T> boolean equalsIgnoreOrders(List<T> expected, List<T> actual) {
        int n = expected.size();
        if (n != actual.size()) return false;
        ArrayList<T> intersection = new ArrayList<>(expected);
        intersection.retainAll(actual);
        return intersection.size() == n;
    }

}
