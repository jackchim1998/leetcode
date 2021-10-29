package medium;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        List<String> words = words(arr);

        StringBuilder result = new StringBuilder();
        int lastIdx = words.size() - 1;
        for (int i = lastIdx; i >= 0; i--) {
            if (i < lastIdx)
                result.append(' ');
            result.append(words.get(i));
        }
        return result.toString();
    }

    private List<String> words(char[] arr) {
        List<String> words = new ArrayList<>();

        StringBuilder temp = new StringBuilder();
        for (char c : arr) {
            if (c == ' ') {
                if (temp.length() != 0) {
                    words.add(temp.toString());
                    temp.setLength(0);
                }
            } else
                temp.append(c);
        }
        if (temp.length() != 0)
            words.add(temp.toString());
        return words;
    }
}
