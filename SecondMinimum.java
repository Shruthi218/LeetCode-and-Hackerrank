class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        int ans = 0;
        Set<Integer> res = new TreeSet<Integer>();
        dfs(root,res);
        Iterator<Integer> iterator = res.iterator();
        if(res.size() < 2) return -1;
        int ans1 = iterator.next();
        int ans2 = iterator.next();
        return ans2;
        
        }
        
    
    
    
    public void dfs(TreeNode root,Set<Integer> res) {
        if(root==null) return;
        res.add(root.val);
        dfs(root.left,res);
        dfs(root.right,res);
    }
}
