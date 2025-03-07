class Solution {
    public static Node reverse(Node head)
    {
        Node current=head;
        Node temp=null;
        Node prev=null;
        while(current!=null)
        {
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }
    public void mergeAlt(Node head1, Node head2){
        //write your code here, and print the result
        if(head1==null ||head2==null)
        {
            return;
        }
        
        //head1=reverse(head1);
        //head2=reverse(head2);
        while(head1!=null && head2!=null)
        {
            System.out.print(head1.data+" ");
            head1=head1.next;
            System.out.print(head2.data+" ");
            head2=head2.next;
        }
        while(head1!=null)
        {
            System.out.print(head1.data+" ");
            head1=head1.next;
        }
        System.out.println();
        while(head2!=null)
        {
            System.out.print(head2.data+" ");
            head2=head2.next;
        }
        
        
    }
}