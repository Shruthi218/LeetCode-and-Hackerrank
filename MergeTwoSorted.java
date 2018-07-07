class Solution
{
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummyhead = new ListNode(0);
    ListNode p=dummyhead;
 
    ListNode p1=l1;
    ListNode p2=l2;
    while(p1!=null && p2!=null)
    {
        if(p1.val <=p2.val){
            p.next = p1;
            p1 = p1.next;
        }else if(p2.val < p1.val)
        {
            p.next = p2;
            p2 = p2.next;
        }
        
       
        p=p.next;
    }
    
    if(p1==null)
        p.next = p2;
    
    else
    {
      p.next = p1;
    }
 
    
 
    return dummyhead.next;
}
}
