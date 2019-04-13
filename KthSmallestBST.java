/*
since k needs to be decremented everytime we find a minimum and java passes k by value, we store k itself in an array called karr of size 1. so every operation on k gets replaced by karr[0].

*/
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] karr = { k };
        int res[] = new int[k];
        kthsmall_helper(root,karr,res);
        return res[0];
        
        
    }
    
    
    public void kthsmall_helper(TreeNode root, int[] karr, int[] res) {
        // find the first minimum
        if(root.left!=null) {
            kthsmall_helper(root.left,karr,res);
        }
        
        karr[0]--;
        if(karr[0]>=0) {
            res[karr[0]] = root.val;
            
        }
        else {
            return;
        }
        
        if(root.right!=null) {
            kthsmall_helper(root.right,karr,res);
        }
        
    }
}
