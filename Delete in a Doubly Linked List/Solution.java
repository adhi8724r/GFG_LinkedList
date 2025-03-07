class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	    Node current=head;
	    for(int i=1;i<x;i++)
	    {
	        current=current.next;
	    }
	    
	    if(current.next==null)
	    {
	        current.prev.next=null;
	    }
	    else if(current.prev==null)
	    {
	        head=head.next;
	    }
	    else
	    {
	        current.prev.next=current.next;
	        current.next.prev=current.prev;   
	    }
	    return head;
    }
}