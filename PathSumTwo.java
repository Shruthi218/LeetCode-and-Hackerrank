/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<Integer> pathlist = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null)
            return result;
        
        helper(root,sum,pathlist,result);
        
    
        
       return result;
        
    }
    
    public void helper(TreeNode root,int sum,List<Integer> pathlist,List<List<Integer>> result) {
        if(root == null)
            return;
        
            
                pathlist.add(root.val);
                if(root.left==null && root.right==null && sum==root.val) {
                    result.add(new ArrayList<>(pathlist));
                    //pathlist.clear();
                }
            
                
        helper(root.left,sum-root.val,pathlist,result);
        helper(root.right,sum-root.val,pathlist,result);
        pathlist.remove(pathlist.size()-1);
    }
}
