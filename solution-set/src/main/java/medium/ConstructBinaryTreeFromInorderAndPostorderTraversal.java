package medium;

import common.TreeNode;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int[] invertedInorder = new int[6001];
        for (int i = 0; i < inorder.length; i++)
            invertedInorder[inorder[i] + 3000] = i;
        return construct(postorder, invertedInorder, 0, postorder.length - 1, 0);
    }

    public TreeNode construct(int[] postorder, int[] invertedInorder, int postLeft, int postRight, int inLeft) {
        if (postLeft > postRight) return null;
        TreeNode root = new TreeNode(postorder[postRight]);
        int rootInOrderIdx = invertedInorder[postorder[postRight] + 3000];
        int mid = rootInOrderIdx - inLeft + postLeft;
        root.left = construct(postorder, invertedInorder, postLeft, mid - 1, inLeft);
        root.right = construct(postorder, invertedInorder, mid, postRight - 1, rootInOrderIdx + 1);
        return root;
    }
}
