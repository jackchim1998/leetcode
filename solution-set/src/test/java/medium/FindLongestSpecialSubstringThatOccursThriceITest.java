package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLongestSpecialSubstringThatOccursThriceITest {
    private final FindLongestSpecialSubstringThatOccursThriceI solution = new FindLongestSpecialSubstringThatOccursThriceI();

    @Test
    void example1() {
        int result = solution.maximumLength("aaaa");
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int result = solution.maximumLength("abcdef");
        assertEquals(-1, result);
    }

    @Test
    void example3() {
        int result = solution.maximumLength("abcaba");
        assertEquals(1, result);
    }
}