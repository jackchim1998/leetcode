package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LongestValidParenthesesTest {
    private final LongestValidParentheses solution = new LongestValidParentheses();

    @Test
    void example1() {
        assertEquals(2, solution.longestValidParentheses("(()"));
    }

    @Test
    void example2() {
        assertEquals(4, solution.longestValidParentheses(")()())"));
    }

    @Test
    void example3() {
        assertEquals(6, solution.longestValidParentheses("(()(())("));
    }

    @Test
    void example4() {
        assertEquals(2, solution.longestValidParentheses("()(()"));
    }

    @Test
    void example5() {
        assertEquals(2, solution.longestValidParentheses("()"));
    }
}
