class Solution
{
    boolean isPalindrome(Node head) 
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
            if(current.data!=stack.pop())
            {
                return false;
            }
            current=current.next;
        }
        return true;
    }    
    
}