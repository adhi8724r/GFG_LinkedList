class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
    	Node c1=node1;
        Node c2=node2;
        
        Node current=null;
        Node res=null;
        while(c1!=null && c2!=null)
        {
            if(c1.data<c2.data)
            {
                res=new Node(c1.data);
                c1=c1.next;
            }
            else
            {
                res=new Node(c2.data);
                c2=c2.next;
            }
            
            if(current==null)
            {
                current=res;
            }
            else
            {
                res.next=current;
                current=res;
            }
        }
        while(c1!=null)
        {
            res=new Node(c1.data);
            res.next=current;
            current=res;
            c1=c1.next;
        }
        while(c2!=null)
        {
            res=new Node(c2.data);
            res.next=current;
            current=res;
            c2=c2.next;
        }
        return current;	
    }
}