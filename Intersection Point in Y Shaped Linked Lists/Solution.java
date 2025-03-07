class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
        // code here
        Node p1=head1;
        Node p2=head2;
        int c1=0;
        int c2=0;
        if(p1==null || p2==null)
            return -1;

        while(p1!=null ||p2!=null)
        {
            if(p1!=null)
            {
                p1=p1.next;
                c1+=1;
            }
            if(p2!=null)
            {
                p2=p2.next;
                c2+=1;
            }
        }
        p1=head1;
        p2=head2;
        if(c1>c2)
        {
            while(c1!=c2)
            {
                p1=p1.next;
                c1-=1;
            }
        }
        else
        {
            while(c2!=c1)
            {
                p2=p2.next;
                c2-=1;
            }
        }
        while(p1!=null)
        {
            if(p1==p2)
                return p1.data;
            p1=p1.next;
            p2=p2.next;
        }
        return -1;
	}
}
