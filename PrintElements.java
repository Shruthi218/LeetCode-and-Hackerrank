/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method. 
    
void Print(Node head) {
    
    Node cur = head;
    
    while(cur!=null)
    {
        System.out.println(cur.data);
        cur = cur.next;
    }
  
  
}
