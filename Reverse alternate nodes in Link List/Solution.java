class Solution
{
    public static void rearrange(Node odd)
    {
        if(odd==null || odd.next==null)
        {
            return;
        }
        Node even=odd.next;
        
        Node even1=even;
        while(even!=null && even.next!=null)
        {
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        
        Node current=even1;
        Node prev=null;
        Node temp=null;
        while(current!=null)
        {
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        even1=prev;
        
        odd.next=even1;
    }
}