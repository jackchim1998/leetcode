package graph.medium;

import java.util.List;

/**
 * @author Jack
 */
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visitedList = new boolean[rooms.size()];
        visit(rooms, visitedList, 0);
        for (boolean visited : visitedList)
            if (!visited)
                return false;
        return true;
    }

    private void visit(List<List<Integer>> rooms, boolean[] visitedList, int idx) {
        if (visitedList[idx]) return;
        visitedList[idx] = true;
        for (Integer key : rooms.get(idx))
            visit(rooms, visitedList, key);
    }
}
