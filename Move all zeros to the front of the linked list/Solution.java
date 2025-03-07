class GfG{
    public Node moveZeroes(Node head){
        //Your Code here.
        Node l1=new Node(0);
        Node l2=new Node(0);
        
        Node x1=l1;
        Node x2=l2;
        Node current=head;
        while(current!=null)
        {
            if(current.data==0)
            {
                l1.next=current;
                l1=l1.next;
            }
            else
            {
                l2.next=current;
                l2=l2.next;
            }
            current=current.next;
        }
        l1.next=null;
        l2.next=null;
        if(x1.next==null)
            x1.next=x2.next;
        else
            l1.next=x2.next;
        return x1.next;
    }
}