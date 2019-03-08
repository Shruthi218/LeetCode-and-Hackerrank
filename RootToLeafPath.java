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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> mainlist = new ArrayList<>();
        myhelper(root,"", mainlist);
        return mainlist;
    }
    
    public void myhelper(TreeNode root,String path,List<String> mainlist) {
        if(root==null) return;
        if(root.left==null && root.right==null) {
            path+=String.valueOf(root.val);
            mainlist.add(path);
        }
        else {
        path+=String.valueOf(root.val);
        path+="->";
        }
        
        myhelper(root.left,path,mainlist);
        myhelper(root.right,path,mainlist);
    }
}
