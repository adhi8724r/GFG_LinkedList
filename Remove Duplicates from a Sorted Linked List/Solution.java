class GfG
{
    Node removeDuplicates(Node head)
    {
	    Node dummy=new Node(0);
	    dummy.next=head;
	    Node current=head;
	    while(current!=null && current.next!=null)
	    {
	        Node next=current.next;
	        if(current.data<next.data)
	        {
	            current=current.next;
	        }
	        else
	        {
	            current.next=next.next;
	        }
	    }
	    return dummy.next;
    }
}