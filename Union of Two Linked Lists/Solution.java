class Sol
{
    public static Node sort(Node head)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Node current=head;
        while(current!=null)
        {
            list.add(current.data);
            current=current.next;
        }
        Collections.sort(list);
        current=head;
        for(int i=0;i<list.size();i++)
        {
            current.data=list.get(i);
            current=current.next;
        }
        return head;
    }
	public static Node findUnion(Node head1,Node head2)
	{
	    head1=sort(head1);
	    head2=sort(head2);
	    
	    Node dummy=new Node(0);
	    Node current=dummy;
	    while(head1!=null && head2!=null)
	    {
	        if((current.data==head1.data) || (current.data==head2.data))
	        {
	            if(current.data==head1.data)
	            {
	                head1=head1.next;
	            }
	            if(current.data==head2.data)
	            {
	                head2=head2.next;
	            }
	        }
	        else
	        {
    	        if(head1.data>head2.data)
    	        {
    	            current.next=head2;
    	            head2=head2.next;
    	            current=current.next;
    	        }
    	        else if(head1.data<head2.data)
    	        {
    	            current.next=head1;
    	            head1=head1.next;
    	            current=current.next;
    	        }
    	        else
    	        {
    	            current.next=head1;
    	            head1=head1.next;
    	            head2=head2.next;
    	            current=current.next;
    	        }
	        }
	    }
	    while(head1!=null)
	    {
	        if(head1.data==current.data)
	        {
	            head1=head1.next;
	        }
	        else
	        {
	            current.next=head1;
	            current=current.next;
	        }
	    }
	    while(head2!=null)
	    {
	        if(head2.data==current.data)
	        {
	            head2=head2.next;
	        }
	        else
	        {
	            current.next=head2;
	            current=current.next;
	        }
	    }
	    current.next=null;
	    return dummy.next;
	    
	}
}