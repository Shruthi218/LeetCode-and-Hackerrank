class Solution {
    public int maxDepth(TreeNode root) {
        int left = 0;
        int right = 0;
        if(root==null) return 0;
        
        if(root.left==null && root.right==null) return 1;
        
        else {
            left = maxDepth(root.left);
            right = maxDepth(root.right);
            
        }
        return Math.max(left,right) + 1;
    }
}
