package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class ReconstructOriginalDigitsFromEnglishTest {
    private final ReconstructOriginalDigitsFromEnglish solution = new ReconstructOriginalDigitsFromEnglish();

    @Test
    void example1() {
        assertEquals("012", solution.originalDigits("owoztneoer"));
    }

    @Test
    void example2() {
        assertEquals("45", solution.originalDigits("fviefuro"));
    }
}
