package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {
    private final ValidParentheses solution = new ValidParentheses();

    @Test
    void example1() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void example2() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void example3() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void example4() {
        assertFalse(solution.isValid("([)]"));
    }

    @Test
    void example5() {
        assertTrue(solution.isValid("{[]}"));
    }
}
