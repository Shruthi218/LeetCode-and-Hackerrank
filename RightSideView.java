class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++) {
                TreeNode temp = queue.poll();
                if(i==0) result.add(temp.val);
                if(temp.right!=null) queue.offer(temp.right);
                if(temp.left!=null) queue.offer(temp.left);
            }
        }
        return result;
    }
}
