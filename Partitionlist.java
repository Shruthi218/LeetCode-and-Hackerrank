Steps :

Step 1 :  Compare target value to every node value while traversing. i.e cur.val > target and so on..
Step 2 : If cur node value is less than target, then we are good, move the pointer one step forward.
Step 3 : Else break the link and copy the node value to a new list.
Step 4 : Continue the above steps till the end.

*/



class Solution {
    public ListNode Partitionlist(ListNode head, int x) {
        
        if(head==null || head.next==null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode res = new ListNode(0);
        ListNode cur3 = res;
        
        
        while(cur!=null) {
            if(cur.val < x) {
                prev = cur;
                cur = cur.next;
            }
            else {
                cur3.next = cur;
                prev.next = cur.next;
                cur = prev.next;
                cur3 = cur3.next;
            }
        }
        //setting last node of res list as null
        cur3.next = null;
        //appending two lists
        
        prev.next = res.next;
        return dummy.next;
        
    }
}
