package medium;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jack
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        Integer[] arr = new Integer[1 << n];
        arr[0] = 0;
        for (int i = 0; i < n; i++)
            doubleGrayCode(arr, i);
        return Arrays.asList(arr);
    }

    private void doubleGrayCode(Integer[] arr, int currN) {
        int currSize = 1 << currN;
        int tail = (currSize << 1) - 1;
        for (int i = 0; i < currSize; i++, tail--)
            arr[tail] = arr[i] | currSize;
    }
}
