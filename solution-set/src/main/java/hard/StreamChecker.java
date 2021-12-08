package hard;

public class StreamChecker {
    private final TrieNode root = new TrieNode();
    private final StringBuilder sb = new StringBuilder();

    public StreamChecker(String[] words) {
        for (String word : words)
            insert(word);
    }

    private void insert(String word) {
        TrieNode curr = root;
        for (int i = word.length() - 1; i >= 0; i--) {
            int idx = word.charAt(i) - 'a';
            if (curr.nodes[idx] == null)
                curr.nodes[idx] = new TrieNode();
            curr = curr.nodes[idx];
        }
        curr.end = true;
    }

    public boolean find() {
        TrieNode curr = root;
        for (int i = sb.length() - 1; i >= 0; i--) {
            TrieNode next = curr.nodes[sb.charAt(i) - 'a'];
            if (next == null)
                return false;
            curr = next;
            if (next.end) return true;
        }
        return false;
    }

    public boolean query(char letter) {
        sb.append(letter);
        return find();
    }

    private static final class TrieNode {
        private final TrieNode[] nodes = new TrieNode[26];
        private boolean end = false;
    }
}
