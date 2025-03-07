class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        Node cur=head;
        Node prev=null;
        Node next=null;
        
        do
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        while(cur!=head);
        head.next=prev;
        head=prev;
        return head;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        Node slow=head;
        Node fast=head.next;
        Node prev=null;
        do
        {
            if(slow.data==key)
            {
                if(prev==null)
                {
                    Node cur=head;
                    while(cur.next!=head)
                    {
                        cur=cur.next;
                    }
                    cur.next=head.next;
                    head=head.next;
                }
                else
                {
                    prev.next=slow.next;
                }
                break;
            }
            prev=slow;
            slow=slow.next;
            fast=fast.next!=null?fast.next.next:null;
        }
        while(slow!=fast);
        return head;
    }
}