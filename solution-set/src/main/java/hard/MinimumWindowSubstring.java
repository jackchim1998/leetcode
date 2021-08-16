package hard;

/**
 * @author Jack
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[] counts = new int[58];
        for (char c : t.toCharArray())
            counts[c - 'A']++;
        String result = "";
        int length = Integer.MAX_VALUE;

        int start = 0;
        int missingCharCount = t.length();
        for (int end = start; end < s.length(); end++) {
            int endCharIdx = s.charAt(end) - 'A';
            if (counts[endCharIdx] > 0)
                missingCharCount--;
            counts[endCharIdx]--;
            while (missingCharCount == 0) {
                if (end - start + 1 < length) {
                    result = s.substring(start, end + 1);
                    length = result.length();
                }
                int startCharIdx = s.charAt(start) - 'A';
                counts[startCharIdx]++;
                if (counts[startCharIdx] > 0)
                    missingCharCount++;
                start++;
            }
        }
        return result;
    }

}
