class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return mydfs(root,root.val);
    }
    
    public boolean mydfs(TreeNode root,int val) {
        if(root==null) return true;
        if(root.val!=val) return false;
        else return mydfs(root.left,val) && mydfs(root.right,val);
    }
}
