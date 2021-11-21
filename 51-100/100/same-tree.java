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
// 同等遍历

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pt = new Stack<TreeNode>();
        Stack<TreeNode> qt = new Stack<TreeNode>();
        if(p != null) pt.push(p);
        if(q != null) qt.push(q);
        while(!pt.empty() && !qt.empty()) {
            TreeNode n1 = pt.pop();
            TreeNode n2 = qt.pop();
            if(n1.val != n2.val) return false;
            if(n1.left != null && n2.left != null) {
                pt.push(n1.left);
                qt.push(n2.left);
            } else if(n1.left != null || n2.left != null) return false;
            if(n1.right != null && n2.right != null) {
                pt.push(n1.right);
                qt.push(n2.right);
            } else if(n1.right != null || n2.right != null) return false;
        }
        if(!pt.empty() || !qt.empty()) return false;

        return true;
    }
}
