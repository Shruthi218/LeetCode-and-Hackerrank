/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) {
            return true;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        // fast is assigned to the node next to head to handle even and odd number linked list together
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode result = reverse(slow.next);
        
        //Splitting linked list into two halves
        
        
        slow.next = null;
        
        // Comparing two lists after splitting
        // cur1 is the head of the first linked list
        //cur2 is the head of the second linked list
        ListNode cur1 = head;
        ListNode cur2 = result;
        
        while(cur1!=null && cur2!=null) {
            if(cur1.val==cur2.val) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            
            else {
                return false;
            }
        }
       
     return true;   
        
    }

    
    public ListNode reverse(ListNode head) {
        
        if(head==null || head.next==null) {
            return head;
        }
        
        ListNode prev = null;
        ListNode cur = head;
        ListNode front = cur.next;
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
