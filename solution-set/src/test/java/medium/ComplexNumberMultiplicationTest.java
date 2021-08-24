package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class ComplexNumberMultiplicationTest {
    private final ComplexNumberMultiplication solution = new ComplexNumberMultiplication();

    @Test
    void example1() {
        String result = solution.complexNumberMultiply("1+1i", "1+1i");
        assertEquals("0+2i", result);
    }

    @Test
    void example2() {
        String result = solution.complexNumberMultiply("1+-1i", "1+-1i");
        assertEquals("0+-2i", result);
    }

}
