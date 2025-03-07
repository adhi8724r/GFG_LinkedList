class GfG
{
    Node deleteNode(Node head, int x)
    {
        Node dummy=new Node(0);
        dummy.next=head;
	    Node current=dummy;
	    for(int i=1;i<x;i++)
	    {
	        current=current.next;
	    }
	    current.next=current.next.next;
	    return dummy.next;
    }
}