class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if(head.next==null)
        {
            return head;
        }
        Node current=head;
        int last;
        while(current.next.next!=null)
        {
            current=current.next;
        }
        last=current.next.data;
        current.next=null;
        Node x=new Node(last);
        x.next=head;
        head=x;
        
        
        return head;
        
    }
}