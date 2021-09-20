package hard;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderlyQueueTest {
    private final OrderlyQueue solution = new OrderlyQueue();

    @Test
    void example1() {
        String result = solution.orderlyQueue("cba", 1);
        assertEquals("acb", result);
    }
    @Test
    void example2() {
        String result = solution.orderlyQueue("ccbbaa", 2);
        assertEquals("aabbcc", result);
    }
}