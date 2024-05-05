package me.tree_dfs;

public class _36CountGoodNodes {
    public int goodNodes(TreeNode root) {
        return 1 + countGoodNodes(root.left, root.val) + countGoodNodes(root.right, root.val);
    }

    private int countGoodNodes(TreeNode root, int x){

        if(root == null)
            return 0;
        int leftCount = countGoodNodes(root.left, Math.max(x, root.val));
        int rightCount = countGoodNodes(root.right, Math.max(x, root.val));
        return leftCount + rightCount + (x > root.val ? 0 : 1);
    }
}
