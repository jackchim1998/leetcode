package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jack
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] a) {
        int[] min = new int[26];
        List<String> res = new ArrayList<>();
        Arrays.fill(min, Integer.MAX_VALUE);
        for (String s : a) {
            int[] local = new int[26];
            for (char c : s.toCharArray())
                local[c - 'a']++;
            for (int i = 0; i < 26; i++)
                min[i] = Math.min(min[i], local[i]);
        }
        for (int i = 0; i < 26; i++)
            for (int j = 0; j < min[i]; j++)
                res.add(String.valueOf((char) ('a' + i)));
        return res;
    }
}
