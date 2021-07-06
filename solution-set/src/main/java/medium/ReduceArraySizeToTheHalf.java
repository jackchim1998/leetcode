package medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Jack
 */
public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            Integer count = countMap.getOrDefault(i, 0);
            count++;
            countMap.put(i, count);
        }

        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (Integer value : countMap.values()) {
            Integer count = map.getOrDefault(value, 0);
            count++;
            map.put(value, count);
        }
        int target = (arr.length >> 1) - 1; // when target is negative, it is done
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (target < key * value)
                return result + target / key + 1;
            else {
                target -= key * value;
                result += value;
            }
        }
        return result;
    }
}
