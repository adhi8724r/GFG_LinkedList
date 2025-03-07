class Solution {
    void reorderlist(Node head) {
        if(head==null || head.next==null)
            return;
        
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        Node current=slow.next;
        slow.next=null;

        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        Node first=head;
        Node second=prev;

        while(second!=null)
        {
            Node firstNext=first.next;
            Node secondNext=second.next;

            first.next=second;
            second.next=firstNext;
            first=firstNext;
            second=secondNext;
        }
    }
}