package medium;

import java.util.PriorityQueue;

public class CombinationIterator {
    PriorityQueue<String> pq = new PriorityQueue<>();

    public CombinationIterator(String characters, int combinationLength) {
        backtrack(characters, combinationLength, 0, new StringBuilder());
    }

    public String next() {
        return pq.poll();
    }

    public boolean hasNext() {
        return !pq.isEmpty();
    }

    private void backtrack(String ch, int len, int start, StringBuilder sb) {
        if (len == 0) {
            pq.add(sb.toString());
            return;
        }
        for (int i = start; i <= ch.length() - len; i++) {
            sb.append(ch.charAt(i));
            backtrack(ch, len - 1, i + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
