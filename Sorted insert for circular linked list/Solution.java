class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newNode=new Node(data);
        Node current=head;
        if(head==null)
        {
            newNode.next=newNode;
            return newNode;
        }
        if(head.data>data)
        {
            newNode.next=head;
            while(head!=current.next)
            {
                current=current.next;
            }
            current.next=newNode;
            return newNode;
        }
        while(current.next!=head && current.next.data<data)
        {
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
        
        return head;
    }
}