package medium;

/**
 * @author Jack
 */
public class NumberOfSubArraysWithBoundedMaximum {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int sum = 0;
        int lengthLowerLeft = 0;
        int lengthLowerEqualRight = 0;
        for (int num : nums) {
            if (num < left) {
                lengthLowerEqualRight++;
                lengthLowerLeft++;
                sum += lengthLowerLeft - lengthLowerEqualRight;
            } else if (num <= right) {
                lengthLowerLeft++;
                lengthLowerEqualRight = 0;
                sum += lengthLowerLeft;
            } else {
                lengthLowerEqualRight = 0;
                lengthLowerLeft = 0;
            }
        }
        return sum;
    }
    /**
     * no need to calculate (1+n) *n / 2, it is same to 1+2+3+4+...+n in for loop
     */
//    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
//        int sum = 0;
//        int lengthLowerLeft = 0;
//        int lengthLowerEqualRight = 0;
//        for (int num : nums) {
//            if (num < left) {
//                lengthLowerEqualRight++;
//                lengthLowerLeft++;
//            } else if (num <= right) {
//                sum -= (lengthLowerEqualRight + 1) * lengthLowerEqualRight / 2;
//                lengthLowerLeft++;
//                lengthLowerEqualRight = 0;
//            } else {
//                sum += (lengthLowerLeft + 1) * lengthLowerLeft / 2 - (lengthLowerEqualRight + 1) * lengthLowerEqualRight / 2;
//                lengthLowerEqualRight = 0;
//                lengthLowerLeft = 0;
//            }
//        }
//        sum -= (lengthLowerEqualRight + 1) * lengthLowerEqualRight / 2;
//        sum += (lengthLowerLeft + 1) * lengthLowerLeft / 2;
//        return sum;
//    }
}
