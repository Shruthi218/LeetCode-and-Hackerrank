class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null || m ==n) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
      ListNode curm = head.next;
      ListNode curn = head.next;
      ListNode prevm = dummy;
        
      
        for(int i=0;i<m-1;i++) {
            prevm = curm;
            curm = curm.next;
        }
        for(int j=0;j<n-1;j++) {
            curn = curn.next;
        }
        ListNode newhead = reverse(curm,curn,prevm);
        prevm.next = newhead;
        return head.next;
    }
    
   public ListNode reverse(ListNode curm, ListNode curn, ListNode prevm) {
       
       
       ListNode prev = null;
       ListNode cur = curm;
       ListNode front = cur.next;
       ListNode next = curn.next;
       
        
       
        while(true) {
            cur.next = prev;
            if(front==next) break;
            prev = cur;
            cur = front;
            front = front.next;
        }
      // prevm.next = cur;
       curm.next = next;
        return cur;
        
    }
    
    
    
}
