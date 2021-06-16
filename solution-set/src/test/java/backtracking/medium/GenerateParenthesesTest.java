package backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class GenerateParenthesesTest {
    private final GenerateParentheses solution = new GenerateParentheses();

    @Test
    void example1() {
        List<String> result = solution.generateParenthesis(3);
        assertEquals(5, result.size());
        assertTrue(result.contains("((()))"));
        assertTrue(result.contains("(()())"));
        assertTrue(result.contains("(())()"));
        assertTrue(result.contains("()(())"));
        assertTrue(result.contains("()()()"));
    }
}
