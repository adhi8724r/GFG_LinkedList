class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        if(head==null || head.next==null)
        {
            return head;
        }
        
        Node l1=head;
        Node l2=head.next;
        
        Node m1=l1;
        Node m2=l2;
        while(l2!=null && l2.next!=null)
        {
            l1.next=l2.next;
            l2.next=l2.next.next;
            
            l1=l1.next;
            l2=l2.next;
        }
        
        Node current=m2;
        Node prev=null;
        Node temp=null;
        while(current!=null)
        {
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        m2=prev;
        
        l1.next=m2;
        
        return m1;
   }
}