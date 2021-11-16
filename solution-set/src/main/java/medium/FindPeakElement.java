package medium;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        do {
            int mid = (left + right) / 2;
            boolean greaterThanLeft = mid == 0 || nums[mid] > nums[mid - 1];
            boolean greaterThanRight = mid == nums.length - 1 || nums[mid] > nums[mid + 1];
            if (greaterThanLeft && greaterThanRight)
                return mid;
            else if (greaterThanLeft)
                left = mid + 1;
            else
                right = mid - 1;
        } while (left < right);
        return left;
    }
}
