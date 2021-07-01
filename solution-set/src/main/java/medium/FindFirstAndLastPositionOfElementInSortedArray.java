package medium;

/**
 * @author Jack
 * q.34
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int right = right(nums, target, 0, nums.length - 1);
        int left = left(nums, target, 0, nums.length - 1);
        return new int[]{left, right};
    }

    private int right(int[] nums, int target, int start, int end) {
        if (start == end) return nums[start] == target ? start : -1;
        int mid = (start + end + 1) / 2;
        if (nums[mid] <= target)
            return right(nums, target, mid, end);
        return right(nums, target, start, mid - 1);
    }

    private int left(int[] nums, int target, int start, int end) {
        if (start == end) return nums[start] == target ? start : -1;
        int mid = (start + end) / 2;
        if (nums[mid] < target)
            return left(nums, target, mid + 1, end);
        return left(nums, target, start, mid);
    }
}
