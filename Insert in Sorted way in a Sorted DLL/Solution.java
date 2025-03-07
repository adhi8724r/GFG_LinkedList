class GfG
{
    public static Node sortedInsert(Node head, int x)
    {
        Node newNode=new Node(x);
        if(head==null)
        {
            return newNode;
        }
        
        Node dummy=new Node(0);
        dummy.next=head;
        Node current=dummy;
        while(current.next!=null && current.next.data<x){
            current=current.next;
        }
    
        newNode.next=current.next;
        current.next=newNode;
        newNode.prev=current;
        if(newNode.next!=null)
        {
            newNode.next.prev=newNode;
        }
        dummy=dummy.next;
        dummy.prev=null;
        return dummy;
        
    }
}