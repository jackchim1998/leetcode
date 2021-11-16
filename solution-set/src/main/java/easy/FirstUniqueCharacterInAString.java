package easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars)
            counts.put(c, counts.getOrDefault(c, 0) + 1);

        for (int i = 0; i < chars.length; i++)
            if (counts.get(chars[i]) == 1)
                return i;
        return -1;
    }
}
