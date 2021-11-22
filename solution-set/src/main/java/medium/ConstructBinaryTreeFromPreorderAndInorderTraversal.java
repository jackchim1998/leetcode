package medium;

import common.TreeNode;

/**
 * @author Jack
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] invertedInorder = new int[6001];
        for (int i = 0; i < inorder.length; i++)
            invertedInorder[inorder[i] + 3000] = i;
        return construct(preorder, invertedInorder, 0, preorder.length - 1, 0);
    }

    public TreeNode construct(int[] preorder, int[] invertedInorder, int preLeft, int preRight, int inLeft) {
        if (preLeft > preRight) return null;
        TreeNode root = new TreeNode(preorder[preLeft]);
        int rootInOrderIdx = invertedInorder[preorder[preLeft] + 3000];
        int mid = rootInOrderIdx - inLeft + preLeft;
        root.left = construct(preorder, invertedInorder, preLeft + 1, mid, inLeft);
        root.right = construct(preorder, invertedInorder, mid + 1, preRight, rootInOrderIdx + 1);
        return root;
    }
}
