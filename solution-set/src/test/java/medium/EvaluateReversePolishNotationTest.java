package medium;

import medium.EvaluateReversePolishNotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class EvaluateReversePolishNotationTest {
    private final EvaluateReversePolishNotation solution = new EvaluateReversePolishNotation();

    @Test
    void example1() {
        int result = solution.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
        assertEquals(22, result);
    }

}
