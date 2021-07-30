package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class MapSumPairsTest {

    @Test
    void example1() {
        MapSumPairs solution = new MapSumPairs();
        solution.insert("apple", 3);
        assertEquals(3, solution.sum("ap"));
        solution.insert("app", 2);
        assertEquals(5, solution.sum("ap"));
    }

    @Test
    void example2() {
        MapSumPairs solution = new MapSumPairs();
        solution.insert("apple", 3);
        assertEquals(3, solution.sum("ap"));
        solution.insert("app", 2);
        solution.insert("apple", 2);
        assertEquals(4, solution.sum("ap"));
    }
}
