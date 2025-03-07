class Solution {
    public static Node rev(Node head)
    {
        Node prev=null;
        Node cur=head;
        Node next=null;
        
        while(cur != null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;        
        }
        
        return prev;
    }
    
    public static Node reverseKGroup(Node node, int k)
    {
        if(k==1)
        {
            return node;
        }
        
        Node current=node;
        Node prev=new Node(-1);
        Node last=node;
        Node start=node;
        
        Node ans=prev;
        for(int i=1;current!=null;i++)
        {
            if(i%k==0)
            {
                last=current;
                current=current.next;
                last.next=null;
                prev.next=rev(start);
                prev=start;
                start=current;
                
            }
            else
            {
                current=current.next;
            }
        }
        if(start!=null)
        {
            start=rev(start);
            prev.next=start;
        }
        return ans.next;
    }
}