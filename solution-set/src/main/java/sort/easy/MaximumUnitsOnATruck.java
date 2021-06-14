package sort.easy;

import java.util.Arrays;

/**
 * @author Jack
 */
public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int result = 0;
        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {
            int num = Math.min(truckSize, boxTypes[i][0]);
            result += num * boxTypes[i][1];
            truckSize -= num;
        }
        return result;
    }
}
