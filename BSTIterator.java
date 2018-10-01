/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class BSTIterator {
  Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
      stack = new Stack<>();
        push(stack,root);
      
    }
    
    public static void push(Stack<TreeNode> stack,TreeNode root) { 
     
        while(root!=null) {
          stack.push(root);
          root = root.left;
      }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        if(!stack.isEmpty()) {
        TreeNode result = stack.pop();
        push(stack,result.right);
        return result.val;
    }
        return 0;
}
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
