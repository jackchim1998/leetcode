package medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    /**
     * 2,3,5 8 [...]
     * -> 2,3,5 6 + [2...]
     *  -> 2,3,5 6 + [2, 2...]
     *  -> 3,5 6 + [2...]
     *      -> 3,5 3 + [2, 3...]
     *          -> 3,5 0 + [2, 3...]
     * -> 3,5 8 [...]
     *  -> 3,5 5 [3, ...]
     *  ...................
     *  -> 5 8 [...]
     *      -> 5 3 [5, ...] cancel
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(candidates, target, 0, result, new ArrayList<>());
        return result;
    }

    public void combinationSum(int[] candidates, int target, int idx, List<List<Integer>> result, List<Integer> combination) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i=idx ; i< candidates.length;i++) {
            combination.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i, result, combination);
            combination.remove(combination.size() - 1);
        }
    }
}
