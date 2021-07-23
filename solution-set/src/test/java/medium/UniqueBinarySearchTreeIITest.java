package medium;

import common.BinaryTreeBuilder;
import common.BinaryTreeBuilderV2;
import common.BinaryTreeUtil;
import common.TreeNode;
import medium.UniqueBinarySearchTreeII;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class UniqueBinarySearchTreeIITest {
    private final UniqueBinarySearchTreeII solution = new UniqueBinarySearchTreeII();

    @Test
    void example1() {
        List<TreeNode> roots = solution.generateTrees(1);
        TreeNode[] answers = new TreeNode[]{
                new BinaryTreeBuilderV2(new Integer[]{1}).build(),
        };
        isMatched(roots,answers);
    }

    @Test
    void example2() {
        List<TreeNode> roots = solution.generateTrees(2);
        TreeNode[] answers = new TreeNode[]{
                new BinaryTreeBuilderV2(new Integer[]{1, null, 2}).build(),
                new BinaryTreeBuilderV2(new Integer[]{2, 1, null}).build(),
        };
        isMatched(roots,answers);
    }

    @Test
    void example3() {
        List<TreeNode> roots = solution.generateTrees(3);
        TreeNode[] answers = new TreeNode[]{
                new BinaryTreeBuilderV2(new Integer[]{1, null, 3,  2}).build(),
                new BinaryTreeBuilderV2(new Integer[]{1, null, 2,  null, 3}).build(),
                new BinaryTreeBuilderV2(new Integer[]{2, 1, 3}).build(),
                new BinaryTreeBuilderV2(new Integer[]{3, 2, null, 1, null}).build(),
                new BinaryTreeBuilderV2(new Integer[]{3, 1, null, null, 2}).build()
        };
        isMatched(roots,answers);
    }

    private void isMatched(List<TreeNode> roots, TreeNode[] answers) {
        assertEquals(answers.length, roots.size());

        int matched = 0;
        for (TreeNode root : roots) {
            for (TreeNode answer : answers) {
                if (BinaryTreeUtil.isAllNodesSameValue(root, answer)) {
                    matched++;
                    break;
                }
            }
        }
        assertEquals(answers.length, matched);
    }

}
