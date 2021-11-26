/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
 // 对比节点值，大于节点值向右子树搜索，小于节点值向左子树搜索，等于节点值返回该节点
 // 若此时节点为叶节点且不等于搜索值，则返回null
 
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(val > root.val) return root.right == null ? null : searchBST(root.right, val);
        else if(val < root.val) return root.left == null ? null : searchBST(root.left, val);
        else return root;
    }
}
