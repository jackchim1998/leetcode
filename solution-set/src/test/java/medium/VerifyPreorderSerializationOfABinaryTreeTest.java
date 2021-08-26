package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class VerifyPreorderSerializationOfABinaryTreeTest {
    private final VerifyPreorderSerializationOfABinaryTree solution = new VerifyPreorderSerializationOfABinaryTree();

    @Test
    void example1() {
        assertTrue(solution.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }

    @Test
    void example2() {
        assertFalse(solution.isValidSerialization("1,#"));
    }

    @Test
    void example3() {
        assertFalse(solution.isValidSerialization("9,#,#,1"));
    }

    @Test
    void example4() {
        assertTrue(solution.isValidSerialization("9,#,92,#,#"));
    }

}
