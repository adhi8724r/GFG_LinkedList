class Solution {
   
    public Node pairwiseSwap(Node head)
    {
        // code here
        Node dummy=new Node(0);
        dummy.next=head;
        Node current=dummy;
        while(current.next!=null && current.next.next!=null)
        {
            Node temp1=current.next.next.next;
            Node temp2=current.next;
            current.next=temp2.next;
            temp2.next=temp1;
            current.next.next=temp2;
            current=current.next.next;
        }
        return dummy.next;
    }
}