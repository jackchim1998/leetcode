package easy;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class FindCommonCharactersTest {
    private final FindCommonCharacters solution = new FindCommonCharacters();

    @Test
    void example1() {
        List<String> res = solution.commonChars(new String[]{"bella", "label", "roller"});
        assertEquals(3, res.size());
        Map<String, Integer> map = toMap(res);
        assertEquals(1, map.get("e"));
        assertEquals(2, map.get("l"));
    }

    private Map<String, Integer> toMap(List<String> res) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : res) {
            Integer cnt = map.getOrDefault(s, 0);
            cnt++;
            map.put(s, cnt);
        }
        return map;
    }

}
