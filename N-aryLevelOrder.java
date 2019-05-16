class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<Node> q = new LinkedList<>();
        if(root==null) return result;
        q.offer(root);
        
        while(!q.isEmpty()) {
            List<Integer> mylist = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++) {
            Node t = q.poll();
            mylist.add(t.val);
            for(Node n: t.children) {
                q.offer(n);
            }
            }
            result.add(mylist);
        }
    return result;
    }
}
