package medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jack
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, visited, result, new LinkedList<>());
        return result;
    }

    private void backtracking(int[] nums, boolean[] visited, List<List<Integer>> result, Deque<Integer> list) {
        if (list.size() == nums.length) result.add(new ArrayList<>(list));
        for (int i = 0; i < nums.length; i++)
            if (!visited[i]) {
                visited[i] = true;
                list.push(nums[i]);
                backtracking(nums, visited, result, list);
                list.pop();
                visited[i] = false;
            }
    }
}
