class Solution {
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2) {
        HashSet<Integer> hs=new HashSet<Integer>();
        Node current = head2;
        while(current!=null)
        {
            hs.add(current.data);
            current=current.next;
        }
        
        Node dummy=new Node(-1);
        Node prev=dummy;
        current=head1;
        while(current!=null)
        {
            if(hs.contains(current.data))
            {
                prev.next=current;
                prev=prev.next;
                current=current.next;
                prev.next=null;
            }
            else
            {
                current=current.next;    
            }
            
        }
        return dummy.next;
    }
    
}