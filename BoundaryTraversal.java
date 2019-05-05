class Solution {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        if(root==null) return al;
        if(root.left==null && root.right==null) {
            al.add(root.val);
            return al;
        }
        al.add(root.val);
        leftboundary(root.left,al);
        leaves(root,al);
        rightboundary(root.right,al);
        return al;
    }
    
    public void leftboundary(TreeNode root, List<Integer> al) {
        if(root==null) return;
        if(root.left!=null) {
            al.add(root.val);
            leftboundary(root.left,al);
        }
        else if(root.right!=null) {
            al.add(root.val);
            leftboundary(root.right,al);
        }
    }
    
    public void rightboundary(TreeNode root,List<Integer> al) {
        if(root==null) return;
        if(root.right!=null) {
            rightboundary(root.right,al);
             al.add(root.val);
        }
        else if(root.left!=null) {
            rightboundary(root.left,al);
            al.add(root.val);
        }
    }
    
    public void leaves(TreeNode root,List<Integer> al) {
        if(root.left!=null) leaves(root.left,al);
        if(root.right!=null) leaves(root.right,al);
        if(root.left==null && root.right==null) al.add(root.val);

    }
}
