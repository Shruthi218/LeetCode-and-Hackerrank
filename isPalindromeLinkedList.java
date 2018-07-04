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
        
        Stack<Integer> st = new Stack<Integer>();
        ListNode cur = head;
        ListNode temp = head;
        
        while(cur!=null)
        {
            st.push(cur.val);
            cur = cur.next;
        }
        
        while(!st.isEmpty() && temp!=null)
        {
            if(st.pop()!=temp.val)
            {
                return false;
            }
            
            else
            {
                temp=temp.next;
            }
            
        }
        
        return true;
        
    }
}
