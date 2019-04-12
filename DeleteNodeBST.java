class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val > key) root.left =  deleteNode(root.left,key);
        else if(root.val < key) root.right = deleteNode(root.right,key);
        else {
            // node with no children
            if(root.left==null && root.right==null) return null;
            // node with one children
            else if(root.left == null) {
                return root.right;
            }
            else if(root.right==null) {
                return root.left;
                
            }
            // node with two children, find the inorder successor of the node to be deleted (find the minimum value in right subtree)
            else {
                TreeNode temp = minValue(root.right);
                if(temp!=null) {
                root.val = temp.val;
                 root.right = deleteNode(root.right,temp.val);   
                }
                
            }
            
            
        }
        
        
        return root;
    }

    
    
   
public TreeNode minValue(TreeNode root) {
        if(root==null) return null;
        TreeNode cur = root;
        while(cur.left!=null) {
            cur = cur.left;
        }
        return cur;
    }

}


