package medium;

import common.BinaryTreeBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class BinaryTreeInorderTraversalTest {
    private final BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

    @Test
    void recursiveExample1() {
        List<Integer> result = solution.recursiveInorderTraversal(new BinaryTreeBuilder(new Integer[]{1, null, 2, 3}).build());
        assertEquals(List.of(1, 3, 2), result);
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
        assertEquals(List.of(2, 1), result);
    }

    @Test
    void recursiveExample5() {
        List<Integer> result = solution.recursiveInorderTraversal(new BinaryTreeBuilder(new Integer[]{1, null, 2}).build());
        assertEquals(List.of(1, 2), result);
    }

    @Test
    void iterativeExample1() {
        List<Integer> result = solution.iterativeInorderTraversal(new BinaryTreeBuilder(new Integer[]{1, null, 2, 3}).build());
        assertEquals(List.of(1, 3, 2), result);
    }

    @Test
    void iterativeExample2() {
        List<Integer> result = solution.iterativeInorderTraversal(new BinaryTreeBuilder(new Integer[0]).build());
        assertEquals(List.of(), result);
    }

    @Test
    void iterativeExample3() {
        List<Integer> result = solution.iterativeInorderTraversal(new BinaryTreeBuilder(new Integer[]{1}).build());
        assertEquals(List.of(1), result);
    }

    @Test
    void iterativeExample4() {
        List<Integer> result = solution.iterativeInorderTraversal(new BinaryTreeBuilder(new Integer[]{1, 2}).build());
        assertEquals(List.of(2, 1), result);
    }

    @Test
    void iterativeExample5() {
        List<Integer> result = solution.iterativeInorderTraversal(new BinaryTreeBuilder(new Integer[]{1, null, 2}).build());
        assertEquals(List.of(1, 2), result);
    }
}
