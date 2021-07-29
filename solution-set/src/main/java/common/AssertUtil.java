package common;


import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.Collections;
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
//            throw new AssertionFailedError(String.format("Inside List length diff, expected: %d, actual: %d", n, actual.size()));
//            throw new AssertionFailedError(String.format("Inside List not matched, expected: %s, actual: %s", expected, actual));

}
