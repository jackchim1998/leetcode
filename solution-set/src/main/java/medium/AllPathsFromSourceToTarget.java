package medium;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> currPath = new ArrayList<>();
        currPath.add(0);
        backtrack(graph, currPath, paths);
        return paths;
    }

    private void backtrack(int[][] graph, List<Integer> currPath, List<List<Integer>> paths) {
        Integer pos = currPath.get(currPath.size() - 1);
        if (pos == graph.length - 1) {
            paths.add(new ArrayList<>(currPath));
            return;
        }
        for (int next : graph[pos]) {
            currPath.add(next);
            backtrack(graph, currPath, paths);
            currPath.remove(currPath.size() - 1);
        }
    }
}
