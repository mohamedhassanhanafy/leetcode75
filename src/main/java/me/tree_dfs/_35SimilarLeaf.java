package me.tree_dfs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _35SimilarLeaf {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List leaves1 = new LinkedList<Integer>();
        List leaves2 = new LinkedList<Integer>();

        fillLeaves(root1, leaves1);
        fillLeaves(root2, leaves2);

        return leaves1.equals(leaves2);

    }

    private void fillLeaves(TreeNode root, List leaves){
        if(root == null){
        } else if(root.left == null && root.right == null){
            leaves.add(root.val);
        }  else {
            fillLeaves(root.left, leaves);
            fillLeaves(root.right, leaves);
        }

    }
}
