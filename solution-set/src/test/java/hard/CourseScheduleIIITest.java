package hard;

import hard.CourseScheduleIII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class CourseScheduleIIITest {
    private final CourseScheduleIII solution = new CourseScheduleIII();

    @Test
    void example1() {
        assertEquals(3, solution.scheduleCourse(new int[][]{
                {100, 200},
                {200, 1300},
                {1000, 1250},
                {2000, 3200}
        }));
    }
}
