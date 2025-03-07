class Delete
{
    Node deleteAtPosition(Node head, int pos)
    {
        if(pos==1)
            return head.next;
            
        Node temp=head;
        
        for(int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
        
        if(temp.next!=null)
        {
            temp.next=temp.next.next;
        }
        
        return head;
    }
}