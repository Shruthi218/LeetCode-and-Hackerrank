public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> result = new ArrayList<List<Integer>>();
       
       if(root == null){
          return result;
       }
       
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       queue.add(root);
       TreeNode temp = null;
       
       int qsize = 0;
       
       while(!queue.isEmpty()) {
       
       List<Integer> mylist = new LinkedList<Integer>(); 
           qsize = queue.size();
           
           for(int i=0;i<qsize;i++) {
           temp = queue.poll();
           mylist.add(temp.val);
           if(temp.left!=null) {
               queue.add(temp.left);
           }
           
           if(temp.right!=null) {
               queue.add(temp.right);
           }
           
           
       }
           result.add(mylist);
       }
        
        return result;
    
    }
}
