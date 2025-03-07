class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node c1=head;
        Node c2=head;
        Boolean loop=false;
        while(c2.next!=null && c2.next.next!=null)
        {
            c1=c1.next;
            c2=c2.next.next;
            if(c1==c2)
            {
                loop=true;
                return countNodes(c1);
            }
        }
        return 0;
    }
    
    public static int countNodes(Node temp)
    {
        Node current=temp.next;
        int count=0;
        while(current!=temp)
        {
            count+=1;
            current=current.next;
        }
        return count+1;
    }
}