class Solution
{
	Node sortList(Node head) {
		if(head==null || head.next==null)
            return head;
        
        Node pos=new Node(0);
        Node neg=new Node(0);
        
        Node p1=pos;
        Node p2=neg;
        
        Node current=head;
        
        while(current!=null)
        {
            if(current.data>=0)
            {
                p1.next=current;
                p1=p1.next;
            }
            else if(current.data<0)
            {
                p2.next=current;
                p2=p2.next;
            }
            current=current.next;
        }
        
        p1.next=null;
        p2.next=null;

        current=neg.next;
        Node prev=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        current=prev;
        if(current==null)
            return pos.next;
            
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=pos.next;
        
        return prev;
	}
}