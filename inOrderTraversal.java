class Solution {
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> al = new ArrayList<Integer>();
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        TreeNode cur = root;
        
        
        if(root==null)
            return al;
        
        
            
        while(!s1.isEmpty() || cur!=null) {
        
        if(cur!=null) {
            s1.push(cur);
            cur = cur.left;
        }
            
            
        else {
            TreeNode temp = s1.pop();
            al.add(temp.val);
            cur = temp.right;
            }
        }
        return al; 
        }
        
           
    }
