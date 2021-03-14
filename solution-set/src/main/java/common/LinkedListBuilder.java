package common;

/**
 * @author Jack
 */
public class LinkedListBuilder {
    private final int[] values;

    public LinkedListBuilder(int[] values) {
        this.values = values;
    }

    public ListNode build() {
        if (values == null || values.length == 0)
            return null;
        ListNode tail = new ListNode(values[values.length - 1], null);
        for (int i = values.length - 2; i >= 0; i--)
            tail = new ListNode(values[i], tail);
        return tail;
    }
}
