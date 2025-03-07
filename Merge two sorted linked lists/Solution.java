class Solution
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node c1, Node c2) {
        
        Node dummy=new Node(0);
        Node current=dummy;
        while(c1!=null && c2!=null)
        {
            if(c1.data<c2.data)
            {
                current.next=c1;
                c1=c1.next;
            }
            else
            {
                current.next=c2;
                c2=c2.next;
            }
            current=current.next;
        }
        if(c1!=null)
            current.next=c1;

        if(c2!=null)
            current.next=c2;
            
        return dummy.next;
   } 
}