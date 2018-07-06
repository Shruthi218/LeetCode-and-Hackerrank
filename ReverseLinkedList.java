class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null)
            return null;
        
        else if(head.next==null)
            return head;
        
        ListNode cur = head;
        ListNode prev = null;
        ListNode front = cur.next;
        
        
        
        
        
        while(true)
        {
            cur.next = prev;
            if(front==null)
                break;
            prev = cur;
            cur = front;
            front = front.next;
            
        }
        
        return cur;
        
    }
}
