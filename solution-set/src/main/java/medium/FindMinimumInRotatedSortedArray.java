package medium;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        return binarySearch(nums, 0, nums.length);
    }

    private int binarySearch(int[] nums, int inclusiveStart, int exclusiveEnd) {
        if (inclusiveStart >= exclusiveEnd - 1)
            return nums[(inclusiveStart + 1) % nums.length];
        int mid = (inclusiveStart + exclusiveEnd) / 2;
        return nums[mid] > nums[0] ? binarySearch(nums, mid, exclusiveEnd) : binarySearch(nums, inclusiveStart, mid);
    }
}
