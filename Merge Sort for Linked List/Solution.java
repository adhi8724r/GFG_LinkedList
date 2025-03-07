class Solution {
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        if(head==null || head.next==null)
            return head;
        
        Node middle=middleNode(head);
        Node middleNext=middle.next;
        middle.next=null;
        
        
        Node left=mergeSort(head);
        Node right=mergeSort(middleNext);
        
        Node sortedList=merge(left,right);
        return sortedList;
    }
    
    public static Node merge(Node head1,Node head2)
    {
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
            
        Node result=null;
        
        if(head1.data<=head2.data)
        {
            result=head1;
            head1.next=merge(head1.next,head2);
        }
        else
        {
            result=head2;
            head2.next=merge(head1,head2.next);
        }
        return result;
    }
    public static Node middleNode(Node head)
    {
        if(head==null || head.next==null)
            return head;
        
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
}