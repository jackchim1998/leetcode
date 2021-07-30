package medium;

import org.junit.jupiter.api.Test;

import static medium.PopulatingNextRightPointersInEachNode.Node;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class PopulatingNextRightPointersInEachNodeTest {
    private final PopulatingNextRightPointersInEachNode solution = new PopulatingNextRightPointersInEachNode();

    @Test
    void example1() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        Node result = solution.connect(root);
        assertEquals(result.left.next, result.right);
    }

}
