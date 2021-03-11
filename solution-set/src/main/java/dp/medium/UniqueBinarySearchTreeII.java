package dp.medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * q.95
 * Constraints:
 * 1 <= n <= 8
 */
public class UniqueBinarySearchTreeII {
    public List<TreeNode> generateTrees(int n) {
        return generateSubTrees(1, n);
    }

    private List<TreeNode> generateSubTrees(int start, int end) {
        if (start > end) {
            List<TreeNode> res = new ArrayList<>();
            res.add(null);
            return res;
        }
        if (start == end)
            return List.of(new TreeNode(start));
        List<TreeNode> roots = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            List<TreeNode> lefts = generateSubTrees(start, i - 1);
            List<TreeNode> rights = generateSubTrees(i + 1, end);
            for (TreeNode left : lefts)
                for (TreeNode right : rights)
                    roots.add(new TreeNode(i, left, right));
        }
        return roots;
    }
}
