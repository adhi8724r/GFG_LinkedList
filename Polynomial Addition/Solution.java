class Solution {
    public static Node addPolynomial(Node head1, Node head2) {
        
        Node dummy=new Node(-1,-1);
        Node prev=dummy;
        while(head1!=null && head2!=null)
        {
            int sum=0;
            int pow=0;
            if(head1.pow==head2.pow)
            {
                sum+=head1.coeff+head2.coeff;
                pow=head1.pow;
                head1=head1.next;
                head2=head2.next;
            }
            else if(head1.pow>head2.pow)
            {
                sum+=head1.coeff;
                pow=head1.pow;
                head1=head1.next;
            }
            else
            {
                sum+=head2.coeff;
                pow=head2.pow;
                head2=head2.next;
            }
            
            Node newNode =new Node(sum,pow);
            prev.next=newNode;
            prev=prev.next;
        }
        if(head1!=null)
        {
            prev.next=head1;
        }
        if(head2!=null)
        {
            prev.next=head2;
        }
        return dummy.next;
    }
}