package binarytree.medium;

import common.TreeNode;

/**
 * @author Jack
 * q.623
 * constraint:
 * The given d is in range [1, maximum depth of the given tree + 1].
 * The given binary tree has at least one tree node.
 */
public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        TreeNode aboveRoot = new TreeNode(0, root, null);
        addNode(aboveRoot, v, d - 1);
        return aboveRoot.left;
    }

    private void addNode(TreeNode node, int v, int d) {
        if (node == null) return;
        if (d <= 0) {
            node.left = new TreeNode(v, node.left, null);
            node.right = new TreeNode(v, null, node.right);
            return;
        }
        addNode(node.left, v, d-1);
        addNode(node.right, v, d-1);
    }

    /**
     * The below is BFS solution:
     * It is slower because it uses Queue structure and generates new class
     */
//    public TreeNode addOneRow(TreeNode root, int v, int d) {
//        Queue<LevelNode> queue = new LinkedList<>();
//        TreeNode aboveRoot = new TreeNode(0, root, null);
//        queue.offer(new LevelNode(aboveRoot, 0));
//        while (!queue.isEmpty()) {
//            LevelNode levelNode = queue.poll();
//            if (levelNode.level == d - 1) {
//                levelNode.treeNode.left = new TreeNode(v, levelNode.treeNode.left, null);
//                levelNode.treeNode.right = new TreeNode(v, null, levelNode.treeNode.right);
//                continue;
//            }
//            if (levelNode.treeNode.left != null) queue.offer(new LevelNode(levelNode.treeNode.left, levelNode.level + 1));
//            if (levelNode.treeNode.right != null) queue.offer(new LevelNode(levelNode.treeNode.right, levelNode.level + 1));
//        }
//        return aboveRoot.left;
//    }
//
//    static class LevelNode {
//        TreeNode treeNode;
//        int level;
//
//        LevelNode(TreeNode treeNode, int level) {
//            this.treeNode = treeNode;
//            this.level = level;
//        }
//    }
}
