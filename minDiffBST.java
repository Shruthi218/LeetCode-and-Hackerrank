class Solution {
    public int minDiffInBST(TreeNode root) {
        
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        inorder(root,mylist);
        
        for(int i=0;i<mylist.size()-1;i++) {
            if(mylist.get(i+1) - mylist.get(i) < min) {
                min = mylist.get(i+1) - mylist.get(i);
            }
        }
        return min;
    }
    
    public void inorder(TreeNode root,ArrayList<Integer> al) {
        if(root==null)
            return;
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
            
    }
}
