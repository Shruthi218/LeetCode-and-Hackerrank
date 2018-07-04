public void deleteNAfterMNodes(Node head,int m, int n){
        if(head == null){
            return;
        }
        while(head != null){
            int i = 0;
            while(head != null && i < m-1){
                head = head.next;
                i++;
            }
            if(head == null){
                break;
            }
            Node temp = head.next;
            i=0;
            while(temp != null && i < n){
                temp = temp.next;
                i++;
            }
            head.next = temp;
            head = temp;
        }
    }
