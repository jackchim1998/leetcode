package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class WordSubsets {
    public List<String> wordSubsets(String[] arrA, String[] arrB) {
        List<String> result = new ArrayList<>();
        int[] globalBCount = new int[26];
        for (String b : arrB) {
            int[] localBCount = new int[26];
            for (char c : b.toCharArray()) {
                int i = c - 'a';
                localBCount[i]++;
                globalBCount[i] = Math.max(globalBCount[i], localBCount[i]);
            }
        }
        for (String a : arrA) {
            int[] cnt = new int[26];
            for (char c : a.toCharArray())
                cnt[c - 'a']++;
            boolean pass = true;
            for (int i = 0; i < 26; i++)
                if (cnt[i] < globalBCount[i]) {
                    pass = false;
                    break;
                }
            if (pass)
                result.add(a);
        }
        return result;
    }
}
