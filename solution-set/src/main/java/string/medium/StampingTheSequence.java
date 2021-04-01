package string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class StampingTheSequence {
    public int[] movesToStamp(String stamp, String target) {
        char[] stampArr = stamp.toCharArray();
        char[] targetArr = target.toCharArray();
        List<Integer> results = new ArrayList<>();
        boolean[] visited = new boolean[target.length()]; // it is location of replacement in stead of location of wildcard
        int wildcards = 0;

        while (wildcards < targetArr.length) {
            boolean replaced = false;
            for (int i = 0; i <= target.length() - stamp.length(); i++) {
                if (!visited[i] && canReplace(targetArr, stampArr, i)) {
                    wildcards += doReplace(targetArr, i, stampArr.length);
                    replaced = true;
                    visited[i] = true;
                    results.add(i);
                    if (wildcards == targetArr.length) break;
                }
            }
            if (!replaced) return new int[0];
        }
        int[] finalResult = new int[results.size()];
        for (int i = 0; i < results.size(); i++)
            finalResult[i] = results.get(results.size() - 1 - i);
        return finalResult;
    }

    private int doReplace(char[] targetArr, int p, int length) {
        int wildcards = 0;
        for (int i = 0; i < length; i++) {
            if (targetArr[i + p] != '*') {
                targetArr[i + p] = '*';
                wildcards++;
            }
        }
        return wildcards;
    }

    private boolean canReplace(char[] targetArr, char[] stampArr, int p) {
        for (int i = 0; i < stampArr.length; i++) {
            if (targetArr[i + p] != '*' && targetArr[i + p] != stampArr[i]) {
                return false;
            }
        }
        return true;
    }
}
