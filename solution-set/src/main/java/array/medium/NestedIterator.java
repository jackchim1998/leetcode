package array.medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jack
 */
public class NestedIterator implements Iterator<Integer> {
    private final List<Integer> list = new ArrayList<>();
    private int idx;

    public NestedIterator(List<NestedInteger> nestedList) {
        flatten(nestedList, list);
        idx = 0;
    }

    void flatten(List<NestedInteger> nestedList, List<Integer> list) {
        for (NestedInteger nestedInteger : nestedList)
            if (nestedInteger.isInteger())
                list.add(nestedInteger.getInteger());
            else
                flatten(nestedInteger.getList(), list);
    }


    @Override
    public boolean hasNext() {
        return idx < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) return null;
        idx++;
        return list.get(idx - 1);
    }


    static class NestedInteger {
        private final int value;
        private final List<NestedInteger> list;

        public NestedInteger(int value) {
            this.value = value;
            this.list = null;
        }

        public NestedInteger(List<NestedInteger> list) {
            this.value = -1;
            this.list = list;
        }

        public boolean isInteger() {
            return list == null;
        }

        public Integer getInteger() {
            return value;
        }

        public List<NestedInteger> getList() {
            return list;
        }
    }
}
