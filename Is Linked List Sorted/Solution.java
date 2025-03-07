class Solution
{
    public static boolean isSorted(Node head)
    {
        boolean flag=false;
        while(head.next!=null && head.data==head.next.data)
        {
            head=head.next;
        }
        
        if(head.next==null)
        {
            return true;
        }
        if((head.data-head.next.data)<0)
        {
            flag=true;
        }
        
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp=temp.next;
            }
            else if(((temp.data-temp.next.data)<0)==flag)
            {
                temp=temp.next;
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
}