package medium;

import common.AssertUtil;
import common.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Jack
 */
class NaryTreeLevelOrderTraversalTest {
    private final NaryTreeLevelOrderTraversal solution = new NaryTreeLevelOrderTraversal();

    @Test
    void example1() {
        Node root = new Node(1, List.of(new Node(3, List.of(new Node(5), new Node(6))), new Node(2), new Node(4)));
        List<List<Integer>> result = solution.levelOrder(root);
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(3, 2, 4),
                List.of(5, 6)
        );
        AssertUtil.assertEquals(expected, result);
    }
}
