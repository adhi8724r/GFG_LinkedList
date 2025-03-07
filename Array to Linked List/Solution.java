class Solution {
    static Node constructLL(int arr[]) {
        Node head=null;
        Node prev=null;
        for(int ele:arr)
        {
            if(head==null)
            {
                head=new Node(ele);
                prev=head;
            }
            else
            {
                prev.next=new Node(ele);
                prev=prev.next;
            }
        }
        return head;
    }
}