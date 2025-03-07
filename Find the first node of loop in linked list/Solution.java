class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        if(head==null || head.next==null)
        {
            return -1;
        }
        Node fast=head.next;
        Node slow=head;
        boolean  loop=false;
        while(fast!=null && fast.next!=null)
        {
            if(fast==slow)
            {
                loop=true;
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        if(!loop)
        {
            return -1;
        }
        
        int length=1;
        slow=slow.next;
        while(slow!=fast)
        {
            length+=1;
            slow=slow.next;
        }
        fast=head;
        slow=head;
        for(int i=0;i<length;i++)
        {
            fast=fast.next;
        }
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        return slow.data;
    }
}