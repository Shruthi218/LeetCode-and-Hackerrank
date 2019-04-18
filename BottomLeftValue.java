class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int res = 0;
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode temp = q.poll();
                if (i==size-1) {
                    res = temp.val;
                }
                if(temp.right!=null) q.offer(temp.right);
                if(temp.left!=null) q.offer(temp.left);
            }
        }
    
        return res;
    }
}
              
