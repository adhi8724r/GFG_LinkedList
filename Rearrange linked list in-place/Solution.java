class GfG 
{
    public static Node rearrange(Node root)
    {
        if(root==null || root.next==null || root.next.next==null)
            return root;
        Node fast=root.next;
        Node slow=root;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        fast=slow.next;
        slow.next=null;
        
        Node current=fast;
        Node next=null;
        Node prev=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        
        fast=prev;
        slow=root;
        Node slow_next=null;
        Node fast_next=null;
        
        while(fast!=null)
        {
            slow_next=slow.next;
            fast_next=fast.next;
            
            slow.next=fast;
            fast.next=slow_next;
            
            slow=slow_next;
            fast=fast_next;
            
        }
        
        return root;
    }
}