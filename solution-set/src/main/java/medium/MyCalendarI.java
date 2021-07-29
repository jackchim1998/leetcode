package medium;

import java.util.TreeMap;

/**
 * @author Jack
 */
public class MyCalendarI {
    private final TreeMap<Integer, Integer> calendar;

    public MyCalendarI() {
        calendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start);
        Integer next = calendar.ceilingKey(start);
        if ((next == null || end <= next) && (prev == null || calendar.get(prev) <= start)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }

}
