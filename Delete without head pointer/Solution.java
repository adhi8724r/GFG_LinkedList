class Solution
{
    void deleteNode(Node del_node)
    {
         // Your code here
        Node current=del_node;
        current.data=current.next.data;
        current.next=current.next.next;
    }
}