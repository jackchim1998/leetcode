package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jack
 * q.870
 * Greedy
 * constraint:
 * 1 <= A.length = B.length <= 10000
 * 0 <= A[i] <= 10^9
 * 0 <= B[i] <= 10^9
 */
public class AdvantageShuffle {
    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        LinkedList<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toCollection(LinkedList::new));
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < B.length; i++) {
            boolean ok = false;
            for (Integer v : list) {
                if (v > B[i]) {
                    ok = true;
                    A[i] = v;
                    list.remove(v);
                    break;
                }
            }
            if (!ok) {
                index.add(i);
            }
        }
        for (int i : index)
            A[i] = list.pollFirst();
        return A;
    }
    /**
     * Below code works and is slow, because treeMap need rebalance
     */
//    public int[] advantageCount(int[] A, int[] B) {
//        TreeMap<Integer, Integer> map = Arrays.stream(A).boxed().collect(Collectors.toMap(i -> i, i -> 1, (a, b) -> a + 1, TreeMap::new));
//        int[] res = new int[A.length];
//        for (int i = 0; i < B.length; i++) {
//            Map.Entry<Integer, Integer> entry = map.higherEntry(B[i]);
//            if (entry != null) {
//                Integer key = entry.getKey();
//                Integer value = entry.getValue();
//                res[i] = key;
//                if (value > 1)
//                    map.put(key, value - 1);
//                else
//                    map.remove(key);
//            }
//            if (entry == null) {
//                entry = map.firstEntry();
//                Integer key = entry.getKey();
//                Integer value = entry.getValue();
//                res[i] = key;
//                if (value > 1)
//                    map.put(key, value - 1);
//                else
//                    map.remove(key);
//            }
//        }
//        return res;
//    }
}
