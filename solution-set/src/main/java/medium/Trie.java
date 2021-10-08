package medium;

public class Trie {
    private final Node root = new Node();

    public void insert(String word) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null)
                curr.children[idx] = new Node();
            curr = curr.children[idx];
        }
        curr.end = true;
    }

    public boolean search(String word) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            Node next = curr.children[c - 'a'];
            if (next == null)
                return false;
            curr = next;
        }
        return curr.end;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;
        for (char c : prefix.toCharArray()) {
            Node next = curr.children[c - 'a'];
            if (next == null)
                return false;
            curr = next;
        }
        for (Node child : curr.children)
            if (child != null)
                return true;
        return curr.end;
    }

    private static class Node {
        private final Node[] children = new Node[26];
        private boolean end = false;
    }
}
