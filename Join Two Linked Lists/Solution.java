class Join
{
    public static Node joinTheLists(Node head1, Node head2)
    {
        Node temp=head1;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        
        temp.next=head2;
        return head1;
    }
}