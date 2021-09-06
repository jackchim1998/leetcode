package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlowestKeyTest {
    private final SlowestKey solution = new SlowestKey();

    @Test
    void example1() {
        char result = solution.slowestKey(new int[]{9, 29, 49, 50}, "cbcd");
        assertEquals('c', result);
    }

    @Test
    void example2() {
        char result = solution.slowestKey(new int[]{12, 23, 36, 46, 62}, "spuda");
        assertEquals('a', result);
    }
}