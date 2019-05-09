class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            List<Integer> mylist = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++) {
            TreeNode temp = q.poll();
            mylist.add(temp.val);
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
            }
            result.add(0, mylist);
            

        }
        return result;
    }
}
