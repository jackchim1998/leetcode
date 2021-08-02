package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * q.78
 * constraint:
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * All the numbers of nums are unique.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int flag = (1 << nums.length) - 1; flag > -1; flag--)
            result.add(subset(flag, nums));
        return result;
    }

    private List<Integer> subset(int flag, int[] nums) {
        List<Integer> subset = new ArrayList<>();
        for (int i = 0; i < nums.length && flag > 0; flag >>>= 1, i++)
            if ((flag & 1) == 1)
                subset.add(nums[i]);
        return subset;
    }
}
