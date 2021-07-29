package common;


import org.opentest4j.AssertionFailedError;

import java.util.List;

/**
 * @author Jack
 */
public class AssertUtil {
    public static void assertEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
        int n = expected.size();
        if (n != actual.size()) throw new AssertionFailedError(String.format("OutSide List length diff, expected: %d, actual: %d", n, actual.size()));
        for (int i = 0; i < n; i++)
            if (!expected.get(i).equals(actual.get(i)))
                throw new AssertionFailedError(String.format("Inside List not matched, expected: %s, actual: %s", expected.get(i), actual.get(i)));
    }

}
