package medium;

import common.BinaryTreeBuilder;
import common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Jack
 */
class FlattenBinaryTreeToLinkedListTest {
    private final FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();

    @Test
    void example1() {
        TreeNode root = new BinaryTreeBuilder(new Integer[]{1, 2, 5, 3, 4, null, 6}).build();
        solution.flatten(root);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, goThroughRight(root));
    }

    private int[] goThroughRight(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode current = root;
        while (current != null) {
            list.add(current.val);
            current = current.right;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
