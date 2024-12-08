package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumOperationsToConvertNumber {
    public int minimumOperations(int[] nums, int start, int goal) {
        if (start == goal) {
            return 0;
        }

        int loop = 0;
        boolean[] repeated = new boolean[1001];
        List<Integer> list = new ArrayList<>();

        repeated[start] = true;
        list.add(start);

        while (!list.isEmpty()) {
            List<Integer> newList = new ArrayList<>();
            loop++;

            for (int value : list) {
                for (int num : nums) {
                    int newValue = value + num;
                    if (newValue == goal) {
                        return loop;
                    }
                    if (newValue >= 0 && newValue <= 1000 && !repeated[newValue]) {
                        repeated[newValue] = true;
                        newList.add(newValue);
                    }

                    newValue = value - num;
                    if (newValue == goal) {
                        return loop;
                    }
                    if (newValue >= 0 && newValue <= 1000 && !repeated[newValue]) {
                        repeated[newValue] = true;
                        newList.add(newValue);
                    }

                    newValue = value ^ num;
                    if (newValue == goal) {
                        return loop;
                    }
                    if (newValue >= 0 && newValue <= 1000 && !repeated[newValue]) {
                        repeated[newValue] = true;
                        newList.add(newValue);
                    }
                }
            }

            list = newList;
        }
        return -1;
    }
}
