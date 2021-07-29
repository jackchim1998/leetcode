package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class MyCalendarITest {
    @Test
    void example1() {
        MyCalendarI calendar = new MyCalendarI();
        assertTrue(calendar.book(10, 20));
        assertFalse(calendar.book(15, 25));
        assertTrue(calendar.book(20, 30));
    }
}
