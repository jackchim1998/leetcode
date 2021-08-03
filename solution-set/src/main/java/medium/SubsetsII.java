package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jack
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtracking(result, nums, new LinkedList<>(), 0);
        return result;
    }

    private void backtracking(List<List<Integer>> result, int[] nums, LinkedList<Integer> curr, int idx) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (curr.isEmpty() || nums[idx] != curr.peek())
            backtracking(result, nums, curr, idx + 1);
        curr.push(nums[idx]);
        backtracking(result, nums, curr, idx + 1);
        curr.pop();
    }
}
