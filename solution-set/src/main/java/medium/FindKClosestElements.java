package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jack
 */
public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int binarySearchResult = Arrays.binarySearch(arr, x);
        int right = binarySearchResult >= 0 ? binarySearchResult : -(binarySearchResult + 1);
        int left = right - 1;
        for (; k > 0; k--) {
            int leftDiff = left >= 0 ? x - arr[left] : Integer.MAX_VALUE;
            int rightDiff = right < arr.length ? arr[right] - x : Integer.MAX_VALUE;
            if (leftDiff > rightDiff) right++;
            else left--;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left + 1; i < right; i++)
            result.add(arr[i]);
        return result;
    }
}
