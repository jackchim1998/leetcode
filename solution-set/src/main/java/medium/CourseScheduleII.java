package medium;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> prerequisitesMap = prerequisitesMap(prerequisites);
        Deque<Integer> result = new LinkedList<>();
        boolean[] added = new boolean[numCourses];
        boolean[] pending = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++)
            if (addCourseFailed(i, result, added, pending, prerequisitesMap))
                return new int[0];
        return toIntArray(result);
    }

    private boolean addCourseFailed(int i, Deque<Integer> result, boolean[] added, boolean[] pending, Map<Integer, Set<Integer>> prerequisites) {
        if (added[i]) return false;
        pending[i] = true;
        Set<Integer> prerequisiteCourses = prerequisites.get(i);
        if (prerequisiteCourses != null)
            for (Integer prerequisiteCourse : prerequisiteCourses) {
                if (pending[prerequisiteCourse]) return true;
                if (addCourseFailed(prerequisiteCourse, result, added, pending, prerequisites)) return true;
            }
        result.addLast(i);
        added[i] = true;
        pending[i] = false;
        return false;
    }

    private int[] toIntArray(Deque<Integer> result) {
        int[] intArray = new int[result.size()];
        int idx = 0;
        while (!result.isEmpty())
            intArray[idx++] = result.pollFirst();
        return intArray;
    }

    private Map<Integer, Set<Integer>> prerequisitesMap(int[][] prerequisites) {
        Map<Integer, Set<Integer>> result = new HashMap<>();
        for (int[] prerequisite : prerequisites)
            result.computeIfAbsent(prerequisite[0], k -> new HashSet<>()).add(prerequisite[1]);
        return result;
    }

}
