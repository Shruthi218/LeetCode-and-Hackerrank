class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root==null)
            return null;
        
        if(root.left==null && root.right==null && root.val == val) {
            return root;
        }
        
        else if(root.val > val) {
            return searchBST(root.left,val);
        }
        else if(root.val < val) {
            return searchBST(root.right,val);
        }
        
        return root;
    }
}
