class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        helper(root1,al1);
        helper(root2,al2);
        return al1.equals(al2);
        // use .equals method to directly check equality of 2 lists
    }
        
    
    public void helper(TreeNode root1, List<Integer> al) {
        if(root1==null) return;
        if(root1.left==null && root1.right==null) al.add(root1.val);
        helper(root1.left,al);
        helper(root1.right,al);
    }
}
