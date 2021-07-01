package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>(numRows);
        ArrayList<Integer> top = new ArrayList<>();
        top.add(1);
        results.add(top);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = results.get(i - 1);
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++)
                curr.add(prev.get(j - 1) + prev.get(j));
            curr.add(1);
            results.add(curr);
        }
        return results;
    }
}
