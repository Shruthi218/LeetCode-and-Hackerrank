class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> al1 = new ArrayList();
        ArrayList<Integer> al2 = new ArrayList();
        helper(root1,al1);
        helper(root2,al2);
        
        if(al1.size()!=al2.size())
            return false;
        
        for(int i=0;i<al1.size();i++) {
            if(al1.get(i)!=al2.get(i))
                return false;
        }
        return true;
    }
    
    public void helper(TreeNode root,ArrayList<Integer> al) {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            al.add(root.val);
        helper(root.left,al);
        helper(root.right,al);
    }
}
