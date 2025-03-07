class Solution
{
    public static int count(Node head, int key)
    {
        Node current=head;
        int count=0;
        while(current!=null)
        {
            if(current.data==key)
            {
                count+=1;
            }
            current=current.next;
        }
        return count;
    }
}