class Solution {
    public Node removeAllDuplicates(Node head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node x=new Node(-1);
        x.next=head;
        Node prev=x;
        Node current=head;
        while(current!=null)
        {
            if(current.next!=null && current.data==current.next.data)
            {
                while(current.next!=null && current.data==current.next.data)
                {
                    current.next=current.next.next;
                }
                prev.next=current.next;
            }
            else
            {
                prev=current;
            }
                current=current.next;
        }
        
        return x.next;
    }
}