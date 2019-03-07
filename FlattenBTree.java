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
    public void flatten(TreeNode root) {
        if(root==null) return;
        
        while(root!=null) {
            TreeNode temp = root.right;
            // if root.left exists then do the below logic
            if(root.left != null)
            {
                TreeNode cur = root.left;
                while(cur.right!=null) {
                // we are looking for the last node 4 to attach it to the right side
                    cur = cur.right;
                }
                root.right = root.left;
                // left side of the tree is copied to the right side
                root.left = null;
                //System.out.println(temp.val);
                cur.right = temp;
            }
            root = root.right;
        }

    }
}
