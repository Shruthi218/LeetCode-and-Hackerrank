class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        List<Integer> al = new ArrayList<>();
        if(root==null) return 0;
        helper(root,al);
        
        for(int i =0;i<al.size();i++) {
            if(al.get(i)>=L && al.get(i) <=R) sum+=al.get(i);
        }
        return sum;
    }
    
    public void helper(TreeNode root, List<Integer> al) {
        if(root==null) return;
        helper(root.left,al);
        al.add(root.val);
        helper(root.right,al);
    }
}
