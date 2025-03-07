class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        Node current=head;
        while(current!=null && current.next!=null)
        {
            current.next=current.next.next;
            current=current.next;
        }
    }
}