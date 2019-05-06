public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode p = head.next;
        ListNode q = head.next.next;
        while(p!=q) {
            if(p==null || q==null || q.next==null) return null; 
            p = p.next;
            q = q.next.next;
            }
        
        p = head;
        
        while(p!=q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
