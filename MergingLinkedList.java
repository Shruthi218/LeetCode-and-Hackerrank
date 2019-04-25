class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode cur3 = dummy;
        
        while(cur1!=null && cur2!=null) {
            if(cur1.val <=cur2.val) {
                cur3.next = cur1;
                cur1 = cur1.next;
                cur3 = cur3.next;
            }
            else if(cur2.val < cur1.val) {
                cur3.next = cur2;
                cur2 = cur2.next;
                cur3 = cur3.next;
            }
        }
        
        if(cur2==null) cur3.next = cur1;
        else if(cur1==null) cur3.next = cur2;
        return dummy.next;
    }
}
