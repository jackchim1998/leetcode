package string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jack
 */
class DetermineIfStringHalvesAreAlikeTest {
    private final DetermineIfStringHalvesAreAlike solution = new DetermineIfStringHalvesAreAlike();

    @Test
    void example1() {
        assertTrue(solution.halvesAreAlike("book"));
    }

    @Test
    void example2() {
        assertFalse(solution.halvesAreAlike("textbook"));
    }

    @Test
    void example3() {
        assertFalse(solution.halvesAreAlike("MerryChristmas"));
    }

    @Test
    void example4() {
        assertTrue(solution.halvesAreAlike("AbCdEfGh"));
    }
}
