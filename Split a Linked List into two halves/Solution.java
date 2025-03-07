class Solution {
    public Pair<Node, Node> splitList(Node head) {
        
        if(head.next==head)
        {
            Pair<Node,Node> a=new Pair<Node,Node>(head,null);
        }
        
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=head && fast.next.next!=head)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if(fast.next.next==head)
            fast=fast.next;
            
        Node head1 = head;
        Node head2 = slow.next;
        slow.next = head1;
        fast.next = head2;
        
        Pair<Node,Node> a=new Pair<Node,Node>(head1,head2);
        return a;
    }
}