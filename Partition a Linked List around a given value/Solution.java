class Solution {
    public static Node partition(Node node, int x) {
        Node lx=new Node(0);
        Node ex=new Node(0);
        Node gx=new Node(0);
        
        Node lx1=lx;
        Node ex1=ex;
        Node gx1=gx;
        
        Node current=node;
        while(current!=null)
        {
            if(current.data>x)
            {
                gx.next=current;
                gx=gx.next;
            }
            else if(current.data<x)
            {
                lx.next=current;
                lx=lx.next;
            }
            else
            {
                ex.next=current;
                ex=ex.next;
            }
            current=current.next;
        }
        lx.next=null;
        ex.next=null;
        gx.next=null;
        if(ex1.next==null)
            ex1.next=gx1.next;
        else
            ex.next=gx1.next;
        if(lx1.next==null)
            lx1.next=ex1.next;
        else
            lx.next=ex1.next;
        return lx1.next;
    }
}