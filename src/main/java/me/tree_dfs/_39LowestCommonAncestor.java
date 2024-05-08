package me.tree_dfs;

public class _39LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        } else if (root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode leftAncestor = lowestCommonAncestor(root.left, p, q);
        TreeNode rightAncestor = lowestCommonAncestor(root.right, p, q);

        if(leftAncestor != null && rightAncestor != null){
            return root;
        }else{
            return leftAncestor == null ? rightAncestor: leftAncestor;
        }
    }
}
