package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jack
 */
public class ArrayOfDoubledPairs {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            Integer cnt = map.getOrDefault(ele, 0);
            map.put(ele, cnt + 1);
        }
        for (int ele : arr) {
            if (!isMatched(map, ele))
                return false;
        }

        return true;
    }

    private boolean isMatched(Map<Integer, Integer> map, int num) {
        if (map.getOrDefault(num, 0) == 0) return true;
        if (num != 0 && num % 2 == 0 && !isMatched(map, num / 2)) return false;
        int doubleNum = num * 2;
        Integer doubledCnt = map.getOrDefault(doubleNum, 0);
        Integer cnt = map.get(num);
        map.put(num, 0);
        map.put(doubleNum, doubledCnt - cnt);
        return doubledCnt >= cnt;
    }

    /**
     * use tree map to ensure order
     */
//    public boolean canReorderDoubled(int[] arr) {
//        Map<Integer, Integer> map = new TreeMap<>();
//        for (int ele : arr) {
//            Integer cnt = map.getOrDefault(ele, 0);
//            map.put(ele, cnt + 1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            Integer cnt = entry.getValue();
//            if (cnt == 0) continue;
//            Integer num = entry.getKey();
//            if (num == 0) {
//                if (cnt % 2 == 1)
//                    return false;
//            } else if (num > 0){
//                int doubled = num * 2;
//                int doubledCnt = map.getOrDefault(doubled, 0);
//                if (doubledCnt < cnt) return false;
//                map.put(doubled, doubledCnt - cnt);
//            } else {
//                if (num % 2 == -1) return false;
//                int half = num / 2;
//                int halfCnt = map.getOrDefault(half, 0);
//                if (halfCnt < cnt) return false;
//                map.put(half, halfCnt - cnt);
//            }
//        }
//        return true;
//    }
}
