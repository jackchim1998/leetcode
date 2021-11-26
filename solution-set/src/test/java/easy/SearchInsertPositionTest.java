package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {
    private final SearchInsertPosition solution = new SearchInsertPosition();

    @Test
    void example1() {
        int result = solution.searchInsert(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int result = solution.searchInsert(new int[]{1, 3, 5, 6}, 2);
        assertEquals(1, result);
    }

    @Test
    void example3() {
        int result = solution.searchInsert(new int[]{1, 3, 5, 6}, 7);
        assertEquals(4, result);
    }

    @Test
    void example4() {
        int result = solution.searchInsert(new int[]{1, 3, 5, 6}, 0);
        assertEquals(0, result);
    }

    @Test
    void example5() {
        int result = solution.searchInsert(new int[]{1}, 0);
        assertEquals(0, result);
    }
}