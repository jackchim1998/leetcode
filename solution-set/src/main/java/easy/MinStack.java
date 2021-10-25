package easy;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    private final Deque<Integer> minStack;
    private final Deque<Integer> numStack;

    public MinStack() {
        this.minStack = new LinkedList<>();
        this.numStack = new LinkedList<>();
    }

    public void push(int val) {
        numStack.push(val);
        Integer prevMin = minStack.peek();
        if (prevMin == null) minStack.push(val);
        else minStack.push(Math.min(val, prevMin));
    }

    public void pop() {
        numStack.pop();
        minStack.pop();
    }

    public int top() {
        return numStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
