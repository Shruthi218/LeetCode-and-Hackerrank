public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) 
            return new LinkedList<List<Integer>>();
        List<List<Integer>> levels = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>(); 
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<Integer>(); 
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode node = q.remove();
                list.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            ((LinkedList)levels).addFirst(list);
        }
        return levels;
    }
}
