class Solution {
    Node deleteMid(Node head) {
        
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}