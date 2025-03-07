class Solution {
    public static boolean detectLoop(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            if(slow==fast)
            {
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}