class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
        Node c1=head1;
        Node c2=head2;
        if(head1==null || head2==null)
        {
            return -1;
        }
        
        while(c1!=c2)
        {
            c1=c1.next;
            c2=c2.next;
            if(c1==c2)
            {
                if(c1!=null)
                {
                    return c1.data;    
                }
                return -1;
            }
            
            if(c1==null)
            {
                c1=head2;
            }
            
            if(c2==null)
            {
                c2=head1;
            }
        }
        return c1.data;
	}
}