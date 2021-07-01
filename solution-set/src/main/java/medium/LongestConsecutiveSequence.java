package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jack
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;
        for (Integer num : set)
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;
                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }
                longest = Math.max(longest, currLen);
            }
        return longest;
    }
}
