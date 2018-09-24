class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        
        ListNode result1 = new ListNode(0);
        ListNode result2 = new ListNode(0);
        ListNode cur = head;
        ListNode cur1 = result1;
        ListNode cur2 = result2;
        
        
        
        while(cur!=null && cur.next!=null) {
           cur1.next = cur;
           cur = cur.next;
            cur1 = cur1.next;
            cur2.next = cur;
            cur = cur.next;
            cur2 = cur2.next;
            }
        cur1.next = cur;
        cur1 = cur1.next;
        
        
        
        cur1.next = result2.next;
        return result1.next;
    }
    
    
    
}
