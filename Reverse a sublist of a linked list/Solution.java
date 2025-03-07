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
    
    public static Node reverseBetween(Node head, int m, int n)
    {
        Node dummy=new Node(0);
        dummy.next=head;
        Node current=dummy;
        
        Node first=dummy;
        Node middle=null;
        Node last=null;
        
        for(int i=1;i<m;i++)
        {
            current=current.next;
        }
        middle=current.next;
        current=middle;
        
        for(int i=m;i<n;i++)
        {
            current=current.next;
        }
        last=current.next;
        current.next=null;
        
        middle=reverse(middle);
        while(middle.next!=null)
        {
            middle=middle.next;
        }
        middle.next=last;
        return dummy.next;
    }
}