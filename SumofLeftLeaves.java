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
    
public int sumOfLeftLeaves(TreeNode root) {
    //sum will be 0 everytime this method is called recursively
        int sum = 0;
        if(root==null) return 0;
        if(root.left!=null && root.left.left==null && root.left.right==null) {
            sum = sum + root.left.val;
        }
    // adding sum to return will retain last sum value
        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        
    }
}
