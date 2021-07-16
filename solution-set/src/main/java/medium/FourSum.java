package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jack
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return List.of();
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] * 4 > target) break;
            for (int j = i + 1; j < nums.length - 1; j++) {
                int front = j + 1;
                int back = nums.length - 1;
                int targetSum = target - nums[i] - nums[j];
                if (nums[back] * 2 < targetSum) continue;
                if (nums[front] * 2 > targetSum) break;
                while (front < back) {
                    int currSum = nums[front] + nums[back];
                    if (currSum < targetSum) front++;
                    else if (currSum > targetSum) back--;
                    else {
                        List<Integer> list = List.of(nums[i], nums[j], nums[front], nums[back]);
                        results.add(list);
                        while (front < back && nums[front] == list.get(2)) front++;
                        while (front < back && nums[back] == list.get(3)) back--;
                    }
                }
                while (j < nums.length - 1 && nums[j] == nums[j + 1]) j++;
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) i++;
        }
        return results;
    }
}
