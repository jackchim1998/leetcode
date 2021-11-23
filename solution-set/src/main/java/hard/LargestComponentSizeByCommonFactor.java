package hard;

import java.util.HashMap;
import java.util.Map;

public class LargestComponentSizeByCommonFactor {
    public int largestComponentSize(int[] nums) {
        Map<Integer, Integer> factors = new HashMap<>();
        UF uf = new UF(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 2; j * j <= num; j++)
                if (num % j == 0) {
                    if (!factors.containsKey(j)) factors.put(j, i);
                    else uf.union(i, factors.get(j));

                    int anotherFactor = num / j;
                    if (!factors.containsKey(anotherFactor)) factors.put(anotherFactor, i);
                    else uf.union(i, factors.get(anotherFactor));
                }
            if (!factors.containsKey(num)) factors.put(num, i);
            else uf.union(i, factors.get(num));
        }
        return uf.max;
    }


    private static class UF {
        private final int[] parent;
        private final int[] size;
        private int max;

        UF(int n) {
            parent = new int[n];
            size = new int[n];
            max = 1;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int idx) {
            if (idx == parent[idx]) return idx;
            parent[idx] = find(parent[idx]);
            return parent[idx];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
                max = Math.max(max, size[rootY]);
            }
        }
    }
}
