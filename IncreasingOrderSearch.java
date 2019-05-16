class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        List<Integer> al = new ArrayList<>();
        inorder_helper(root,al);
        TreeNode myroot = new TreeNode(al.get(0));
        TreeNode cur = myroot;
        for(int i=1;i<al.size();i++) {
            cur.right = new TreeNode(al.get(i));
            cur = cur.right;
        }
        return myroot;
    }
    
    public void inorder_helper(TreeNode root,List<Integer> al) {
        if(root==null) return;
        inorder_helper(root.left,al);
        al.add(root.val);
        inorder_helper(root.right,al);
    }
}
