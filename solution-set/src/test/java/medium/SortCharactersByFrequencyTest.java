package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SortCharactersByFrequencyTest {
    private final SortCharactersByFrequency solution = new SortCharactersByFrequency();

    @Test
    void example1() {
        String result = solution.frequencySort("tree");
        assertEquals("eert", result);
    }

    @Test
    void example2() {
        String result = solution.frequencySort("cccaaa");
        assertEquals("aaaccc", result);
    }

    @Test
    void example3() {
        String result = solution.frequencySort("Aabb");
        assertEquals("bbAa", result);
    }

    @Test
    void example4() {
        String result = solution.frequencySort("2a554442f544asfasssffffasss");
        assertEquals("sssssssffffff44444aaaa55522", result);
    }

}