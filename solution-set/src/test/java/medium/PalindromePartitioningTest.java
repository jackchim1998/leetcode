package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Jack
 */
class PalindromePartitioningTest {
    private final PalindromePartitioning solution = new PalindromePartitioning();

    @Test
    void example1() {
        List<List<String>> result = solution.partition("aab");
        validateMatch(List.of(List.of("a", "a", "b"), List.of("aa", "b")), result);
    }

    private void validateMatch(List<List<String>> expectedResult, List<List<String>> actualResult) {
        if (expectedResult.size() != actualResult.size())
            throw new RuntimeException("Size not matched");
        boolean[] checked = new boolean[actualResult.size()];
        for (List<String> expectedList : expectedResult) {
            boolean matched = false;
            for (int i = 0; i < actualResult.size(); i++)
                if (!checked[i] && isMatched(expectedList, actualResult.get(i))) {
                    checked[i] = true;
                    matched = true;
                    break;
                }
            if (!matched)
                throw new RuntimeException("No actualList matched " + listToString(expectedList));
        }
    }

    private boolean isMatched(List<String> expectedList, List<String> actualList) {
        if (expectedList.size() != actualList.size())
            return false;
        boolean[] checked = new boolean[actualList.size()];
        for (String expectedString : expectedList) {
            boolean matched = false;
            for (int i = 0; i < actualList.size(); i++)
                if (!checked[i] && expectedString.equals(actualList.get(i))) {
                    checked[i] = true;
                    matched = true;
                    break;
                }
            if (!matched)
                return false;
        }
        return true;
    }

    private String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("list: ");
        for (String s : list)
            sb.append(s).append(' ');
        return sb.toString();
    }
}
