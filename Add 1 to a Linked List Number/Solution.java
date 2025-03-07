class Solution {
    public static Node reverse(Node head)
    {
        Node current=head;
        Node prev=null;
        Node next=null;
        
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    
    public static Node addOne(Node head) 
    { 
        head=reverse(head);
        Node current=head;
        int carry=1;
        Node prev=null;
        while(current!=null)
        {
            int sum=current.data+carry;
            carry=sum/10;
            current.data=sum%10;
            prev=current;
            current=current.next;
        }
        if(carry!=0)
        {
            Node newNode=new Node(carry);
            prev.next=newNode;
        }
        return reverse(head);
    }
}