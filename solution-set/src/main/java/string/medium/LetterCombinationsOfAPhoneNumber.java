package string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        char[][] letters = new char[][]{
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x', 'y', 'z'}
        };
        int idx = 0;
        List<StringBuilder> tmp = new ArrayList<>();
        while (idx < digits.length()) {
            if (idx == 0) {
                for (char letter : letters[digits.charAt(idx) - '2']) {
                    StringBuilder sb = new StringBuilder(4);
                    sb.append(letter);
                    tmp.add(sb);
                }
            } else {
                int size = tmp.size();
                int choices = letters[digits.charAt(idx) - '2'].length;
                for (int j = 1; j < choices; j++)
                    for (int i = 0; i < size; i++)
                        tmp.add(new StringBuilder(tmp.get(i)));
                    for (int i=0; i<choices; i++)
                        for (int j=0; j<size;j++)
                            tmp.get(i*size + j).append(letters[digits.charAt(idx) - '2'][i]);
            }
            idx++;
        }
        List<String> ans = new ArrayList<>();
        for (StringBuilder builder : tmp)
            ans.add(builder.toString());
        return ans;
    }
}
