package medium;

import java.util.ArrayList;
import java.util.List;

public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
    public int maxLength(List<String> arr) {
        List<Element> elements = removeStringWithDuplicateLetters(arr);
        return backtracking(elements, 0, 0, 0);
    }

    private List<Element> removeStringWithDuplicateLetters(List<String> arr) {
        List<Element> elements = new ArrayList<>();
        for (String s : arr) {
            int bits = 0;
            boolean noDuplicate = true;
            for (char c : s.toCharArray()) {
                int bit = 1 << (c - 'a');
                if ((bits & bit) != 0) {
                    noDuplicate = false;
                    break;
                }
                bits |= bit;
            }
            if (noDuplicate)
                elements.add(new Element(bits, s.length()));
        }
        return elements;
    }

    private int backtracking(List<Element> elements, int currBit, int currLength, int nextIdx) {
        int max = currLength;
        for (int i = nextIdx; i < elements.size(); i++) {
            Element element = elements.get(i);
            if ((currBit & element.bits) == 0) {
                int length = backtracking(elements, currBit | element.bits, currLength + element.len, i + 1);
                max = Math.max(max, length);
            }
        }
        return max;
    }

    private static class Element {
        final int bits;
        final int len;

        public Element(int bits, int len) {
            this.bits = bits;
            this.len = len;
        }
    }
}
