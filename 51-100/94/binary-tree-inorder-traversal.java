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

// 使用辅助List记录，非递归的形式

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        List<Integer> result = new ArrayList<>();
        TreeNode l1 = root;
        while(l1 != null) {
            st.push(l1);
            l1 = l1.left;
        }
        while(!st.empty()) {
            TreeNode node = st.peek();
            st.pop();
            result.add(node.val);
            if(node.right != null) {
                node = node.right;
                while(node != null) {
                    st.push(node);
                    node = node.left;
                }
            }
        }

        return result;
    }
}
