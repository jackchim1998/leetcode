package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jack
 */
public class BrickWalls {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> edges = new HashMap<>();
        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                edges.put(sum, edges.getOrDefault(sum, 0) + 1);
            }
        }
        int max = 0;
        for (Integer cnt : edges.values())
            max = Math.max(max, cnt);
        return wall.size() - max;
    }
}
