class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(height(root) == -1) return false;
        else return true;
        
    }
    
    public int height(TreeNode root) {
        if(root==null) return 0;
        int lheight = height(root.left);
        if(lheight==-1) return -1;
        int rheight = height(root.right);
        if(rheight==-1) return -1;
        if(Math.abs(lheight- rheight) > 1) {
            return -1;
        }
        else {
            return 1 + Math.max(lheight,rheight);
        }
    }
    
}
