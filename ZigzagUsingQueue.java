/* ZigZag Traversal using Queue */

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()) {
            List<Integer> mylist = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode temp = q.poll();
                if(level % 2==0) mylist.add(temp.val);
                else mylist.add(0,temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            result.add(mylist);
            level++;
            
        }
        return result;
    }
}
