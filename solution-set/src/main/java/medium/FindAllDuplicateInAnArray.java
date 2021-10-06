package medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums) {
            int absNum = Math.abs(num);
            int idx = absNum - 1;
            if (nums[idx] < 0) result.add(absNum);
            else nums[idx] *= -1;
        }
        return result;
    }
}
