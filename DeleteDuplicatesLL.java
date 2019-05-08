class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode prev = dummy;
        ListNode cur = dummy.next;
        
        while(cur!=null && cur.next!=null) {
            if(cur.val!=cur.next.val) {
                prev = cur;
                cur = cur.next;
            }
            else {
                while(cur.next!=null && cur.val==cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
                prev.next = cur;
            }
        }
        
       return dummy.next;
    }
}
