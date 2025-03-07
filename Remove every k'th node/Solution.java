class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	    Node dummy=new Node(0);
	    dummy.next=head;
	    Node current=dummy;
	    for(int i=1;current.next!=null;i++)
	    {
	        if(i%k==0)
	        {
	            if(current.next.next!=null)
	                current.next=current.next.next;
	            else
	                current.next=null;
	        }
	        else
	            current=current.next;
	    }
	    return dummy.next;
    }
}