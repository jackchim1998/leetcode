package easy;

import common.BinaryTreeBuilder;
import java.util.List;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePreorderTraversalTest {
    private final BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    @Test
    void recursiveExample1() {
        List<Integer> result = solution.recursiveInorderTraversal(new BinaryTreeBuilder(new Integer[]{1, null, 2, 3}).build());
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    void recursiveExample2() {
        List<Integer> result = solution.recursiveInorderTraversal(new BinaryTreeBuilder(new Integer[0]).build());
        assertEquals(List.of(), result);
    }

    @Test
    void recursiveExample3() {
        List<Integer> result = solution.recursiveInorderTraversal(new BinaryTreeBuilder(new Integer[]{1}).build());
        assertEquals(List.of(1), result);
    }

    @Test
    void recursiveExample4() {
        List<Integer> result = solution.recursiveInorderTraversal(new BinaryTreeBuilder(new Integer[]{1, 2}).build());
        assertEquals(List.of(1, 2), result);
    }

    @Test
    void recursiveExample5() {
        List<Integer> result = solution.recursiveInorderTraversal(new BinaryTreeBuilder(new Integer[]{1, null, 2}).build());
        assertEquals(List.of(1, 2), result);
    }
}