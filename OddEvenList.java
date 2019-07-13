/**
 * Definition for singly-linked list.
 
 1 - 2 - 3 - 4 -5
 
 o/p
 
 1-3-5-2-4
 
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode newhead = head.next;
        
        while(p1.next!=null && p2.next!=null) {
            p1.next = p2.next;
            p2.next = p1.next.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = newhead;
        return head;
    }
}
