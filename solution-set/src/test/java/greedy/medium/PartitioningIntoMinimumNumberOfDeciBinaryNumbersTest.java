package greedy.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {
    private final PartitioningIntoMinimumNumberOfDeciBinaryNumbers solution = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    void example1() {
        int result = solution.minPartitions("27346209830709182346");
        assertEquals(9, result);
    }
}
