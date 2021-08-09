package common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class Node {
    public final int val;
    public final List<Node> children = new ArrayList<>();

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children.addAll(children);
    }
}
