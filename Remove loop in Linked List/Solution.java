class Solution
{
    public static void removeLoop(Node head){
     
        Node slow=head;
        Node fast=head.next;
        
        while(fast!=null&&fast.next!=null)
        {
            if(fast==slow)
            {
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==slow)
        {
            slow=head;
            while(slow!=fast.next)
            {
                slow=slow.next;
                fast=fast.next;
            }
            fast.next=null;
        }
    }
}