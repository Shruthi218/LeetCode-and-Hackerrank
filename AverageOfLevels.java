class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Double> result = new ArrayList<Double>();
        if(root==null) return result;
        q.add(root);
        int n = 0;
        
        while(!q.isEmpty()) {
           n = q.size();
            double sum = 0.0;
            //resetting sum to 0 for every level after calculation
            for(int i=0;i<n;i++) {
                TreeNode temp = q.poll();
                sum = sum + temp.val;
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            
        }
            result.add(sum/n);
        }
        
        return result;
    }
}
