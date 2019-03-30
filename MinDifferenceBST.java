class Solution {
    double min = Double.MAX_VALUE;
    int result;
    public int closestValue(TreeNode root, double target) {
        while(root!=null) {
            if(min > Math.abs(root.val - target)) {
            min = Math.abs(root.val - target);
            result = root.val;
           }
        if(root.val >=target) root = root.left;
            else root = root.right; 
     }
        return result;
}
}
