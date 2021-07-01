package hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Jack
 */
public class CourseScheduleIII {
    public int scheduleCourse(int[][] courses) { // although not quick, but seems clear
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<Integer> timeSpent = new PriorityQueue<>((a, b) -> b - a);
        int totalTimeSpent = 0;
        for (int[] course : courses) {
            timeSpent.add(course[0]);
            totalTimeSpent += course[0];
            if (totalTimeSpent > course[1])
                totalTimeSpent -= timeSpent.poll();
        }
        return timeSpent.size();
    }
}
