package hard;

import java.util.Arrays;

/**
 * @author Jack
 */
public class MaximumGap {
    /**
     * bucket sort
     * we have n-1 buckets and n-2 number (exclude min max)
     * Therefore, at least one bucket is empty,
     * which ensure the gap in one bucket must be less than gap between buckets
     */
    public int maximumGap(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        int gap = (int) Math.ceil((double) (max - min) / (nums.length - 1));
        int[] minBuckets = new int[nums.length - 1];
        int[] maxBuckets = new int[nums.length - 1];
        Arrays.fill(minBuckets, Integer.MAX_VALUE);
        Arrays.fill(maxBuckets, Integer.MIN_VALUE);

        for (int num : nums) {
            if (num == min || num == max)
                continue;
            int idx = (num - min) / gap;
            minBuckets[idx] = Math.min(minBuckets[idx], num);
            maxBuckets[idx] = Math.max(maxBuckets[idx], num);
        }
        int result = 0;
        int previous = min;
        for (int i = 0; i < nums.length - 1; i++) {
            if (minBuckets[i] == Integer.MAX_VALUE && maxBuckets[i] == Integer.MIN_VALUE)
                continue; // empty
            result = Math.max(minBuckets[i] - previous, result);
            previous = maxBuckets[i];
        }
        result = Math.max(max - previous, result);
        return result;
    }
}
