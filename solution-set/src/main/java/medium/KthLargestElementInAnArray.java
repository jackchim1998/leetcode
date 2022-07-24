package medium;

/**
 * @author jack
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1,nums.length - k);
    }

    private int quickSelect(int[] nums, int start, int end, int k) {
        int partition = partition(nums, start, end);
        if (partition == k)
            return nums[k];
        return partition < k ? quickSelect(nums, partition + 1, end, k) :
                quickSelect(nums, start, partition - 1, k);
    }

    int partition(int[] nums, int start, int end) {
        int i = start;
        for (int j = start; j < end; j++) {
            if (nums[j] < nums[end]) {
                swap(nums, i++, j);
            }
        }
        swap(nums, i, end);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
