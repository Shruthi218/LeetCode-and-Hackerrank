class Solution {
    public int closestValue(TreeNode root, double target) {
        int res = root.val;//return value
        double diff = Math.abs(root.val - target);//difference between target and root
        while(root != null) {
            if(root.val >= target) {
                root = root.left;
                
            } else {
                root = root.right;
            }
            if(root != null) {
                double pdiff = Math.abs(root.val - target);
                if(pdiff<= diff) {
                    diff = pdiff;
                    res = root.val;
                    System.out.println(res);
                }
            }
        }
        return res;
    }
}
