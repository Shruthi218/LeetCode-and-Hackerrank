class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int BottomLeftValue = 0;
        
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i=0;i<n;i++) {
                TreeNode temp = q.poll();
                if(i==0) {
                    BottomLeftValue = temp.val;
                }
                
                if(temp.left!=null) {
                    q.add(temp.left);
                }
                if(temp.right!=null) {
                    q.add(temp.right);
                }
                
                
            }
        }
       return BottomLeftValue; 
    }
}
              
