class Solution
{

    void rearrangeEvenOdd(Node head)
    {
        Node even=new Node(0);
        Node odd=new Node(0);
        
        Node odd1=odd;
        Node even1=even;
        Node current=head;
        for(int i=1;current!=null;i++)
        {
            if(i%2==0)
            {
                even.next=current;
                even=even.next;
            }
            else
            {
                odd.next=current;
                odd=odd.next;
            }
            current=current.next;
        }
        even.next=null;
        odd.next=null;
        if(even1.next==null)
        {
            odd.next=null;
        }
        else
        {
            odd.next=even1.next;
        }
        head=odd1.next;
    }
}