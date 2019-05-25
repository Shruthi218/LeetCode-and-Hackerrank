class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
        ListNode p = l1;
        ListNode q = l2;
        
        int carry = 0;
        
        while(p!=null || q!=null) {
            
            int sum = 0;
            if(p!=null) sum += p.val;
            if(q!=null) sum +=q.val;
            sum += carry;
            System.out.println(sum);
            if(sum > 9) {
                carry = 1;
            }
            else carry = 0;
            int value = sum % 10;
            cur.next = new ListNode(value);
            //cur.next = mynode;
            cur = cur.next;
            if(p!=null) p = p.next;
            if(q!=null) q = q.next;
        }
        
        System.out.println(carry);
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
