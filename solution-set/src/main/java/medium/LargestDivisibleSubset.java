package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] lens = new int[nums.length];
        Arrays.fill(lens, 1);
        int[] paths = new int[nums.length];
        Arrays.fill(paths, -1);
        int idxMax = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++)
                if (nums[i] % nums[j] == 0 && lens[i] < lens[j] + 1) {
                    lens[i] = lens[j] + 1;
                    paths[i] = j;
                }
            if (lens[i] > lens[idxMax]) {
                idxMax = i;
            }
        }

        LinkedList<Integer> result = new LinkedList<>();
        while (idxMax != -1) {
            result.addFirst(nums[idxMax]);
            idxMax = paths[idxMax];
        }
        return result;
    }
}
