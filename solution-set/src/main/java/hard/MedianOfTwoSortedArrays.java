package hard;

/**
 * @author jack
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mod = (nums1.length + nums2.length) % 2;
        int k = (nums1.length + nums2.length) / 2;
        if (mod == 1) {
            return quickSelect(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, k);
        } else {
            double val1 = quickSelect(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, k - 1);
            double val2 = quickSelect(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, k);
            return (val1 + val2) / 2;
        }
    }

    public double quickSelect(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int partition1 = partition(nums1, start1, end1);
        int partition2 = partition(nums2, start2, end2);
        if (partition1 + partition2 + 1 == k)
            return Math.max(nums1[partition1], nums2[partition2]);
        else if (partition1 + partition2 == k)
            return Math.min(nums1[partition1], nums2[partition2]);
        else if (partition1 + partition2 < k) {
            if (nums1[partition1] < nums2[partition2])
                return quickSelect(nums1, partition1 + 1, end1, nums2, start2, end2, k);
            else
                return quickSelect(nums1, start1, end1, nums2, partition2 + 1, end2, k);
        }else {
            if (nums1[partition1] < nums2[partition2])
                return quickSelect(nums1, start1, end1, nums2, start2, partition2 -1, k);
            else
                return quickSelect(nums1, start1, partition1 -1, nums2, start2, end2, k);
        }
    }

    private int partition(int[] nums, int start, int end) {
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
