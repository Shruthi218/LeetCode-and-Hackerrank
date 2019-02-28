class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        int value = root.val;
        
        if(root.left!=null) {
            if(root.left.val!=value) return false;
        }
        
        if(root.right!=null) {
            if(root.right.val!=value) return false;
        }
        
        return isUnivalTree(root.left) && isUnivalTree(root.right);
        
    }
    
    
}
