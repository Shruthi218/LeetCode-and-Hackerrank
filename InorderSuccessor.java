/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // Case 1 : Right subtree is not empty
        if(p.right!=null) {
            TreeNode cur = p.right;
            while(cur.left!=null) 
                cur = cur.left;
             return cur;
        }
        
        // Case 2 : If right tree is empty, search the node p from root, the node from where we take the last left is the answer
        TreeNode successor = null;
        while(root!=null) {
            if(p.val < root.val) {
                successor = root;
                root = root.left;
            }
            else if(p.val > root.val) {
                root = root.right;
            }
            else if(p.val==root.val) break;
            
        }
        return successor;
    }
}




