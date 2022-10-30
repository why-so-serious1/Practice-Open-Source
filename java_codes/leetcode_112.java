// Please run on leetcode compiler to check results
//Leetcode 1578

/**
 * Input: root = [1,2,3], targetSum = 5
 * Output: false
 * Explanation: There two root-to-leaf paths in the tree:
 * (1 --> 2): The sum is 3.
 * (1 --> 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int tar) {
        if (root == null)
            return false;

        return helper(root, tar);
    }

    boolean helper(TreeNode root, int tar) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null && tar - root.val == 0)
            return true;

        boolean res = false;
        res = res || helper(root.left, tar - root.val);
        res = res || helper(root.right, tar - root.val);

        return res;
    }
}