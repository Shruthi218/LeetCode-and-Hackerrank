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
    public int[] findMode(TreeNode root) {
        if(root==null) return new int[0];
        
       HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
        inorder(root, mp);
        List<Integer> al = new ArrayList<>();
        
        
        int maxValueInMap=Collections.max(mp.values());
        // returns the maximum value in a BST
        
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            if(entry.getValue()==maxValueInMap) {
                //System.out.println(entry.getKey());  
                al.add(entry.getKey());
            }
        }
        
        
        int [] res = new int[al.size()];
        
        for(int k=0;k<al.size();k++) {
            res[k] = al.get(k);
        }
        return res;
    }
    
    public void inorder(TreeNode root,HashMap<Integer,Integer> mp ) {
        if(root==null) return;
        inorder(root.left,mp);
        if(!mp.containsKey(root.val)) {
            mp.put(root.val,1);
        }
        else mp.put(root.val,mp.get(root.val)+1);
        inorder(root.right,mp);
        
    }
}
