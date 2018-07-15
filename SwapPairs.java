class Solution {
    public ListNode SwapPairs(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        ListNode p = head;
        ListNode q = null;
        ListNode temp = null;
        ListNode newstart = p.next;
        
        while(true) {
            q = p.next;
            temp = q.next;
            q.next = p;
            if(temp==null) {
                
            p.next = null;
                break;
            }
            
            else if(temp.next==null) {
                p.next = temp;
                break;
            }
            else {
                p.next = temp.next;
                p = temp;
            }
            
            
        }
        return newstart;
    }
}
