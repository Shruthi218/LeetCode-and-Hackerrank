public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null) {
            slow = slow.next;
            if(fast.next==null) break;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        slow = head;
        while(slow!=null && fast!=null) {
            if(slow!=fast) {
            slow = slow.next;
            fast = fast.next;
            }
            else return slow;
        }
        return null;
    }
}
    
