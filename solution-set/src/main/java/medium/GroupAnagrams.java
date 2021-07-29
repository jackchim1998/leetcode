package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jack
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Key, List<String>> map = new HashMap<>();
        for (String s : strs)
            map.computeIfAbsent(new Key(s), key -> new ArrayList<>()).add(s);
        return new ArrayList<>(map.values());
    }

    private static final class Key {
        private final int[] counts = new int[26];

        Key(String s) {
            for (char c : s.toCharArray())
                counts[c - 'a']++;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Key key = (Key) o;

            return Arrays.equals(counts, key.counts);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(counts);
        }
    }
}
