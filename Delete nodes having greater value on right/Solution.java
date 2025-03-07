class Solution
{
    public static Node reverse(Node head)
    {
        Stack<Integer> stack=new Stack<Integer>();
        Node current=head;
        while(current!=null)
        {
            stack.push(current.data);
            current=current.next;
        }
        current=head;
        while(current!=null)
        {
            current.data=stack.pop();
            current=current.next;
        }
        return head;
    }
    Node compute(Node head)
    {
        Node dummy=new Node(0);
        head=reverse(head);
        dummy.next=head;
        Node current=head;
        Node prev=dummy;
        while(current!=null && current.next!=null)
        {
            if(current.data>current.next.data)
            {
                current.next=current.next.next;
                prev=current;
            }
            else
            {
                prev=current;
                current=current.next;
            }
        }
        head=reverse(dummy.next);
        return head;
    }
}
  