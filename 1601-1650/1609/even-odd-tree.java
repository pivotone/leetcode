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
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        if((root.val & 1) == 0) return false;
        q1.offer(root);
        int i = 2;
        while(!q1.isEmpty() || !q2.isEmpty()) {
            Queue<TreeNode> q = new LinkedList<>();
            if((i & 1) == 0) {
                int res = 1000001;
                for(TreeNode t : q1) {
                    if(t.left != null) {
                        if((t.left.val & 1) == 1) return false;
                        if(t.left.val < res) res = t.left.val;
                        else return false;
                        q.offer(t.left);
                    }
                    if(t.right != null) {
                        if((t.right.val & 1) == 1) return false;
                        if(t.right.val < res) res = t.right.val;
                        else return false;
                        q.offer(t.right);
                    }
                }
                q2 = q;
                q1.clear();
            }
            else {
                int res = 0;
                for(TreeNode t : q2) {
                    if(t.left != null) {
                        if((t.left.val & 1) == 0) return false;
                        if(t.left.val > res) res = t.left.val;
                        else return false;
                        q.offer(t.left);
                    }
                    if(t.right != null) {
                        if((t.right.val & 1) == 0) return false;
                        if(t.right.val > res) res = t.right.val;
                        else return false;
                        q.offer(t.right);
                    }
                }
                q1 = q;
                q2.clear();
            }
            i++;
        }

        return true;
    }
}
