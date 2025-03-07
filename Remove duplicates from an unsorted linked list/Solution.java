class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        HashMap<Integer,Boolean> map=new HashMap<>();
        Node cur=head;
        Node prev=null;
        
        while(cur!=null)
        {
            if(map.containsKey(cur.data))
            {
                prev.next=cur.next;
            }
            else
            {
                map.put(cur.data,true);
                prev=cur;
            }
            cur=cur.next;
        }
        
        return head;
    }
}