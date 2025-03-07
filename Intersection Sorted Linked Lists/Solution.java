class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node dummy=new Node(0);
        Node current=dummy;
        while(head1!=null && head2!=null)
        {
            if(head1.data==head2.data)
            {
                Node newNode=new Node(head1.data);
                current.next=newNode;
                current=current.next;
                head1=head1.next;
                head2=head2.next;
            }
            else if(head1.data>head2.data)
            {
                head2=head2.next;
            }
            else
            {
                head1=head1.next;
            }
        }
        return dummy.next;
    }
}