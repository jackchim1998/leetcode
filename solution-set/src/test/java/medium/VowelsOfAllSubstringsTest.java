package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsOfAllSubstringsTest {
    private final VowelsOfAllSubstrings solution = new VowelsOfAllSubstrings();

    @Test
    void example1() {
        long result = solution.countVowels("aba");
        assertEquals(6, result);
    }

    @Test
    void example2() {
        long result = solution.countVowels("abc");
        assertEquals(3, result);
    }

    @Test
    void example3() {
        long result = solution.countVowels("ltcd");
        assertEquals(0, result);
    }

    @Test
    void example4() {
        long result = solution.countVowels("noosabasboosa");
        assertEquals(237, result);
    }

}