class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node dummy=new Node(0);
        dummy.next=head1;
        Node current=dummy;
        while(current.next!=null)
        {
            if(key<current.next.data)
            {
                Node newNode=new Node(key);
                Node temp=current.next;
                current.next=newNode;
                newNode.next=temp;
                return dummy.next;
            }
            current=current.next;
        }
        Node newNode=new Node(key);
        current.next=newNode;
        return dummy.next;
        
        
    }
}