package medium;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CourseScheduleIITest {
    private final CourseScheduleII solution = new CourseScheduleII();

    @Test
    void example1() {
        int numOfCourses = 2;
        int[][] prerequisites = {{1, 0}};
        int[] result = solution.findOrder(numOfCourses, prerequisites);
        validate(result, numOfCourses, prerequisites);
    }

    @Test
    void example2() {
        int numOfCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] result = solution.findOrder(numOfCourses, prerequisites);
        validate(result, numOfCourses, prerequisites);
    }

    @Test
    void example3() {
        int numOfCourses = 1;
        int[][] prerequisites = {};
        int[] result = solution.findOrder(numOfCourses, prerequisites);
        validate(result, numOfCourses, prerequisites);
    }

    @Test
    void example4() {
        int numOfCourses = 2;
        int[][] prerequisites = {{0, 1}, {1, 0}};
        int[] result = solution.findOrder(numOfCourses, prerequisites);
        assertArrayEquals(new int[0], result);
    }

    private void validate(int[] result, int numOfCourses, int[][] prerequisites) {
        validateEveryCourseIncluded(result, numOfCourses);
        validatePrerequisites(result, prerequisites);
    }

    private void validatePrerequisites(int[] result, int[][] prerequisites) {
        int[] invertedResult = new int[result.length];
        for (int i = 0; i < result.length; i++)
            invertedResult[result[i]] = i;
        for (int[] prerequisite : prerequisites)
            assertThat(invertedResult[prerequisite[1]]).isLessThan(invertedResult[prerequisite[0]]);

    }

    private void validateEveryCourseIncluded(int[] result, int numOfCourses) {
        assertEquals(numOfCourses, result.length);
        boolean[] exists = new boolean[numOfCourses];
        for (int i : result) {
            assertFalse(exists[i], "Course " + i + " is duplicated");
            exists[i] = true;
        }

    }
}
