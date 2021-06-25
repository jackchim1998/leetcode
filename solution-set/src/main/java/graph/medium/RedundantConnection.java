package graph.medium;

/**
 * @author Jack
 */
public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length + 1];
        for (int i = 0; i < edges.length; i++) {
            int srcRoot = find(parent, edges[i][0]);
            int desRoot = find(parent, edges[i][1]);
            if (srcRoot == desRoot) return edges[i];
            else parent[srcRoot] = desRoot;
        }
        return new int[2];
    }

    private int find(int[] parent, int i) {
        if (parent[i] == 0) return i;
        else return find(parent, parent[i]);
    }
}
