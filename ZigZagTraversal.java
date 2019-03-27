class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList<List<Integer>>();
        
        if(root==null) return result;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        
        while(true) {
            List<Integer> mylist = new ArrayList<>();
        while(!st1.isEmpty()) {
            TreeNode temp1 = st1.pop();
            mylist.add(temp1.val);
            if(temp1.left!=null) st2.push(temp1.left);
            if(temp1.right!=null) st2.push(temp1.right);
        }
            result.add(mylist);
        mylist = new ArrayList<>();
        while(!st2.isEmpty()) {
            TreeNode temp2 = st2.pop();
            mylist.add(temp2.val);
            if(temp2.right!=null) st1.push(temp2.right);
            if(temp2.left!=null) st1.push(temp2.left);
        }
            if(mylist.size() > 0)
            result.add(mylist);
            if(st1.isEmpty() && st2.isEmpty()) break;
    }
        return result;
}
}
    
