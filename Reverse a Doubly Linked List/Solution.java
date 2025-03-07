public static Node reverseDLL(Node  head)
{
    while(head!=null)
    {
        Node temp=head.next;
        head.next=head.prev;
        head.prev=temp;
        if(temp==null)
            break;
        head=temp;
    }
    return head;
}