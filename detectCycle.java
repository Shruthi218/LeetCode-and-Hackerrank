public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        Set<ListNode> st = new HashSet<ListNode>();
        
        ListNode cur = head;
        
        while(cur!=null) {
        if(!st.contains(cur)) {
            st.add(cur);
            cur = cur.next;
         }
        else {
            return cur;
        }
    }
            
      return null;
    }
}
