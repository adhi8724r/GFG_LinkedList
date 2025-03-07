class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node zero=new Node(0);
        Node one=new Node(1);
        Node two=new Node(2);
        
        Node zero1=zero;
        Node one1=one;
        Node two1=two;
        
        
        Node current=head;
        while(current!=null)
        {
            if(current.data==0)
            {
                zero.next=current;
                zero=zero.next;
            }
            else if(current.data==1)
            {
                one.next=current;
                one=one.next;
            }
            else if(current.data==2)
            {
                two.next=current;
                two=two.next;
            }
            current=current.next;
        }
        zero.next=null;
        one.next=null;
        two.next=null;
        
        if(one1.next!=null)
        {
            zero.next=one1.next;
        }
        else
        {
            zero.next=two1.next;
        }
        one.next=two1.next;
        
        return zero1.next;
    }
}