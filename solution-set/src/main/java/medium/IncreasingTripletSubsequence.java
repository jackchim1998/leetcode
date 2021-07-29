package medium;

/**
 * @author Jack
 */
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int min = Integer.MAX_VALUE; // global Min
        int threshold = Integer.MAX_VALUE; // every num exceed threshold means increasingTriplet
        for (int num : nums) {
            if (num > threshold) return true;
            min = Math.min(num, min);
            if (num > min)
                threshold = num;
        }
        return false;
    }
}
