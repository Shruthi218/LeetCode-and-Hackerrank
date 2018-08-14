class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null || head.next==null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode slow = head;
        ListNode fast = head;
        int i = 0;
        while(i<n) {
            fast = fast.next;
            i++;
        }
        
        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
    
        if(slow.next.next!=null) {
        slow.next = slow.next.next;
        }
        else {
            slow.next = null;
        }
        return dummy.next;
}
}
