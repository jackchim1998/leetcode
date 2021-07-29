package medium;

import common.AssertUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
                List.of("nat","tan"),
                List.of("ate","eat","tea")
        );
        AssertUtil.assertEqualsIgnoreOrders(expected, result);
    }
}
