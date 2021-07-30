package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jack
 */
public class MapSumPairs {
    private final TrieNode root;
    private final Map<String, Integer> map;

    public MapSumPairs() {
        root = new TrieNode();
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        int increase = val - map.getOrDefault(key, 0);
        TrieNode curr = root;
        for (char c : key.toCharArray()) {
            int idx = c - 'a';
            if (curr.nodes[idx] == null) curr.nodes[idx] = new TrieNode();
            curr.nodes[idx].val += increase;
            curr = curr.nodes[idx];
        }
        map.put(key, val);
    }

    public int sum(String prefix) {
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            curr = curr.nodes[c - 'a'];
            if (curr == null) return 0;
        }
        return curr.val;
    }

    private static final class TrieNode {
        private final TrieNode[] nodes = new TrieNode[26];
        private int val = 0;
    }
}
