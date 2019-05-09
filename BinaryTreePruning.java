class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return null;
        return hasOne(root);
        
    }
    
    public TreeNode hasOne(TreeNode root) {
        if(root==null) return null;
        root.left = hasOne(root.left);
        root.right = hasOne(root.right);
        if(root.left==null && root.right==null && root.val==0) return null;
        else return root;
    }
}
