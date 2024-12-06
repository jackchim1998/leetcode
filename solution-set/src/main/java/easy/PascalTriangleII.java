package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jack
 */
public class PascalTriangleII {
    /**
     * 1 1 0 0 0
     * 1 2 1* 0 0
     * 1 3 3 1 0
     * 1 4 6 4 1
     */
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }

        int[] result = new int[rowIndex + 1];
        result[0] = 1;
        result[1] = 1;
        for (int i=0;i<rowIndex-1;i++) {
            for (int j= i+2 ; j> 0; j--) {
                result[j] = result[j] + result[j-1];
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j : result) {
            list.add(j);
        }
        return list;
    }
}
