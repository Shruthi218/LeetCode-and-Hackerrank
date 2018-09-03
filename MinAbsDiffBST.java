/* Iterative Approach to find minimum absolute difference between two nodes in a BST */

class Solution {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        int curdiff = Integer.MAX_VALUE;
        inorder_helper(root,res);
        
        for(int i=0;i+1<res.size();i++) {
            if(res.get(i+1) - res.get(i) <= curdiff) {
                curdiff = res.get(i+1) - res.get(i);
            }
        }
      return curdiff;  
    }
    
    public void inorder_helper(TreeNode root,List<Integer> al) {
        if(root==null)
            return;
        inorder_helper(root.left,al);
        al.add(root.val);
        inorder_helper(root.right,al);
    }
}
