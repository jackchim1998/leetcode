package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CombinationIteratorTest {
    @Test
    void example1() {
         CombinationIterator iterator = new CombinationIterator("abc", 2);
         assertEquals("ab", iterator.next());
         assertTrue(iterator.hasNext());
         assertEquals("ac", iterator.next());
         assertTrue(iterator.hasNext());
         assertEquals("bc", iterator.next());
         assertFalse(iterator.hasNext());
    }

    @Test
    void example2() {
        CombinationIterator iterator = new CombinationIterator("abc", 1);
        assertTrue(iterator.hasNext());
        assertEquals("a", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("b", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("c", iterator.next());
        assertFalse(iterator.hasNext());
    }
}