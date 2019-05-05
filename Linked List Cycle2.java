public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode cur = head;
        Set<ListNode> set = new HashSet<>();
        while(!set.contains(cur)) {
            set.add(cur);
            if(cur.next!=null) cur = cur.next;
        }
        if(cur.next==null) return null;
        else return cur;
    }
}
