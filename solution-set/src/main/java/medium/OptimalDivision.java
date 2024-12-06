package medium;

public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        // Is it always x0/(x1/x2/x3)
        if (nums.length == 1)
            return String.valueOf(nums[0]);
        if (nums.length == 2)
            return nums[0] + "/" + nums[1];
        StringBuilder sb = new StringBuilder(nums[0] + "/(");
        for (int i = 1; i < nums.length; i++)
            sb.append(nums[i] + "/");
        sb.setCharAt(sb.length() - 1, ')');
        return sb.toString();
    }
}
