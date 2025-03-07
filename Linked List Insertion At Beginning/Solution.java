class Solution {
    public Node insertAtBegining(Node head, int x) {
        Node newNode=new Node(x);
        newNode.next=head;
        return newNode;
    }
}