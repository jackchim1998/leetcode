package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Jack
 */
class GroupAnagramsTest {
    private final GroupAnagrams solution = new GroupAnagrams();

    @Test
    void example1() {
        List<List<String>> result = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        List<List<String>> expected = List.of(
                List.of("bat"),
                List.of("nat", "tan"),
                List.of("ate", "eat", "tea")
        );
        AssertUtil.assertEqualsIgnoreOrders(expected, result);
    }

    @Test
    void example2() {
        List<List<String>> result = solution.groupAnagrams(new String[]{""});
        List<List<String>> expected = List.of(
                List.of("")
        );
        AssertUtil.assertEqualsIgnoreOrders(expected, result);
    }

    @Test
    void example3() {
        List<List<String>> result = solution.groupAnagrams(new String[0]);
        List<List<String>> expected = List.of();
        AssertUtil.assertEqualsIgnoreOrders(expected, result);
    }
}
