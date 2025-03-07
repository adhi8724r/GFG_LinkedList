class Solution {
    public Node rotate(Node head, int k) {
        int len=1;
        
        if(k==0 ||head==null)
            return head;
        
        Node temp=head;
        while(temp.next!=null)
        {
            len+=1;
            temp=temp.next;
        }
        
        k=k%len;
        
        if(k==0)
        {
            temp.next=null;        
            return head;
        }
        
        temp.next=head;
        
        temp=head;
        for(int i=1;i<k;i++)
        {
            temp=temp.next;
        }
        
        head=temp.next;
        temp.next=null;
        return head;
    }
}
