package easy;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIdx = 0, oddIdx = 1, len = nums.length;
        while (evenIdx < len && oddIdx < len) {
            while (evenIdx < len && nums[evenIdx] % 2 == 0) {
                evenIdx += 2;
            }
            while (oddIdx < len && nums[oddIdx] % 2 == 1) {
                oddIdx += 2;
            }
            if (evenIdx < len && oddIdx < len) {
                int tmp = nums[evenIdx];
                nums[evenIdx] = nums[oddIdx];
                nums[oddIdx] = tmp;
            }
        }
        return nums;
    }
}
