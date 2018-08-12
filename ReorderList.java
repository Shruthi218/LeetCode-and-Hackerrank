/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*

Step 1: Reverse second half of the linked list.
Step 2 : Split the resultant linked list into two halves.
Step 3 : Merge the two lists to get the required reorder list.



*/

class Solution {
    public void reorderList(ListNode head) {
        
        if(head==null || head.next==null) {
            return;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode res = reverse(slow.next);
        slow.next = null;
        ListNode cur1 = head;
        ListNode cur2 = res;
        ListNode dummy = new ListNode(0);
        ListNode cur3 = dummy;
        
        
        // We are moving only cur3 for linking purpose. Not copying or creating new nodes.
        while(cur1!=null && cur2!=null) {
            cur3.next = cur1;
            cur1 = cur1.next;
            cur3 = cur3.next;
            cur3.next = cur2;
            cur2 = cur2.next;
            cur3 = cur3.next;
            
            
        }
        if(cur1!=null) {
            cur3.next = cur1;
        }
        head = dummy.next;
    }
        
    
    public ListNode reverse(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode front = head.next;
        
        while(true) {
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
