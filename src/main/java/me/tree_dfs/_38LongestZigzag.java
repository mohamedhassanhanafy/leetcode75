package me.tree_dfs;

public class _38LongestZigzag {

    int maxSum = 0;
    public int longestZigZag(TreeNode root) {

        longestZigzag(root.right, 0 ,true);
        longestZigzag(root.left, 0,false);

        return maxSum;
    }

    // isRight means that node is right of previous
    private void longestZigzag(TreeNode node, int currSum, boolean isRight){

        if(node == null)
            return;
        if(isRight){
            if(1 + currSum > maxSum)
                maxSum = currSum + 1;
            longestZigzag(node.right, 0,true);
            longestZigzag(node.left, 1 + currSum,false);
        }
        else {
            if(1 + currSum > maxSum)
                maxSum = currSum + 1;
            longestZigzag(node.right, 1 + currSum ,true);
            longestZigzag(node.left, 0,false);
        }
    }
}
