package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combinationSum2(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void combinationSum2(int[] candidates, int target, int idx, List<Integer> combination, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            combination.add(candidates[i]);
            combinationSum2(candidates, target - candidates[i], i + 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }
}
