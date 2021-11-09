package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> exists = new HashSet<>();
        for (int num : nums)
            if (!exists.add(num))
                return true;
        return false;
    }
}
