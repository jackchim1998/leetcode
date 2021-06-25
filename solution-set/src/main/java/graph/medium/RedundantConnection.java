package graph.medium;

/**
 * @author Jack
 */
public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length + 1];
        for (int[] edge : edges) {
            int srcRoot = find(parent, edge[0]);
            int desRoot = find(parent, edge[1]);
            if (srcRoot == desRoot) return edge;
            else parent[srcRoot] = desRoot;
        }
        return new int[2];
    }

    private int find(int[] parent, int i) {
        if (parent[i] == 0) return i;
        else return find(parent, parent[i]);
    }
}
