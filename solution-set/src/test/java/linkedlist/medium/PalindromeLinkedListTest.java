package linkedlist.medium;

import common.LinkedListBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class PalindromeLinkedListTest {
    private final PalindromeLinkedList solution = new PalindromeLinkedList();

    @Test
    void example1() {
        assertTrue(solution.isPalindrome(new LinkedListBuilder(new int[]{1, 2, 2, 1}).build()));
    }

    @Test
    void example2() {
        assertTrue(solution.isPalindrome(new LinkedListBuilder(new int[]{1, 2, 3, 2, 1}).build()));
    }

    @Test
    void example3() {
        assertFalse(solution.isPalindrome(new LinkedListBuilder(new int[]{1, 2, 3, 1}).build()));
    }
}
