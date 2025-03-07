class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node c=new Node(x);
        c.next=head;
        head=c;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node c=new Node(x);
        if(head==null)
        {
            return c;
        }
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=c;
        return head;
    }
}