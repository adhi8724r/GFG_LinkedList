class Solution {
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
    public static Node reverse(Node head, int k) {
        // code here
        Node current=head;
        for(int i=1;i<k;i++)
        {
            current=current.next;
        }
        Node second=current.next;
        current.next=null;
        head=reverse(head);
        second=reverse(second);
        current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=second;
        return head;
    }
}