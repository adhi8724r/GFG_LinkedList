class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
	
        int count=0;
        while(head!=null)
        {
            count+=1;
            head=head.next;
        }
        return count;
    }
}