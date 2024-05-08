package me.tree_dfs;

public class _37PathSumIII {

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        return numberOfSumInPath(root.left, targetSum,  root.val) +
                numberOfSumInPath(root.right, targetSum,  root.val) +
                (root.val == targetSum? 1 : 0) +
                (root.val == 0 ?  numberOfSumInPath(root.left, targetSum,  root.val) +
                        numberOfSumInPath(root.right, targetSum,  root.val) : 0);
    }

    private int numberOfSumInPath(TreeNode node, int targetSum, int currentSum){
        if(node == null){
            return 0;
        }

        if(node.val == targetSum || node.val + currentSum == targetSum ){
            // add new sum and start from zero. just path has more target sum in path
            return 1 + numberOfSumInPath(node.left, targetSum, 0) +
                    numberOfSumInPath(node.right, targetSum, 0);
        }else {
            return numberOfSumInPath(node.left, targetSum, currentSum + node.val) +
                    numberOfSumInPath(node.right, targetSum, currentSum + node.val) +
                    numberOfSumInPath(node.left, targetSum, node.val) +
                    numberOfSumInPath(node.right, targetSum, node.val);
        }
    }

    private int numberOfSumInPath2(TreeNode node, int targetSum, int currentSum){
        if(node == null){
            return 0;
        }
        int currentValueSum = node.val == targetSum || node.val + currentSum == targetSum ? 1 : 0;
        return currentValueSum + numberOfSumInPath(node.left, targetSum, currentSum + node.val) +
                numberOfSumInPath(node.right, targetSum, currentSum + node.val) +
                numberOfSumInPath(node.left, targetSum, node.val) +
                numberOfSumInPath(node.right, targetSum, node.val);
    }
}
