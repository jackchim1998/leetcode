package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @author jack
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (s1, s2) -> {
            String s1First = s1 + s2;
            String s2First = s2 + s1;
            return s2First.compareTo(s1First);
        });
        if ("0".equals(arr[0]))
            return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}
