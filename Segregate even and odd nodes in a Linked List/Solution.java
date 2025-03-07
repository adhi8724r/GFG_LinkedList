class Solution{
    Node divide(int N, Node head){
        // code here
        Node even=new Node(0);
        Node odd=new Node(0);
        
        Node even1=even;
        Node odd1=odd;
        
        Node current=head;
        for(int i=1;current!=null;i++)
        {
            if(current.data%2==0)
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
            even1.next=odd1.next;
        }
        else
        {
            even.next=odd1.next;
        }
        return even1.next;
        
    }
}