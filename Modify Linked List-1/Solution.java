class Solution
{
    public static Node modifyTheList(Node head)
    {
        Stack<Integer> stack=new Stack<Integer>();
        Node current=head;
        while(current!=null)
        {
            stack.push(current.data);
            current=current.next;
        }
        current=head;
        int n=stack.size();
        for(int i=0;i<n/2;i++)
        {
            current.data=stack.pop()-current.data;
            current=current.next;
        }
        while(current!=null)
        {
            current.data=stack.pop();
            current=current.next;
        }
        return head;
    }
}