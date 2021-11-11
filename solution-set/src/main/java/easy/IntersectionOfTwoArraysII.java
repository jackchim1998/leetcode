package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums1)
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        for (int num : nums2) {
            Integer count = counts.getOrDefault(num, 0);
            if (count > 0) {
                intersection.add(num);
                counts.put(num, --count);
            }
        }
        return intersection.stream().mapToInt(i -> i).toArray();
    }
}
