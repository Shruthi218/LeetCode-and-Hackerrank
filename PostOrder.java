class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        List<Integer> result = new ArrayList<Integer>();
        if(root==null) return result;
        stack1.push(root);
        while(!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();
            stack2.push(temp);
            if(temp.left!=null) {
                stack1.push(temp.left);
                
            }
            if(temp.right!=null) {
                stack1.push(temp.right);
            }
        }
        
        while(!stack2.isEmpty()) {
            TreeNode node = stack2.pop();
            result.add(node.val);
        }
        return result;
    }
}
