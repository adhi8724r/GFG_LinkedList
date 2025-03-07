class Solution {
    static void linkdelete(Node head, int n, int m) {
        Node current=head;
        while(current!=null){
            for(int i=1;i<m && current!=null;i++)
            {
                current=current.next;
            }
            
            if(current==null || current.next==null)
            {
                return;
            }
            
            Node last=current;
            current=current.next;
            for(int i=0;i<n && current!=null;i++)
            {
                current=current.next;
            }
            last.next=current;
            current=last.next;
        }
    }
}