class Solution {
    public void alternatingSplitList(Node head){
       //Your code here
        if(head==null)
        {
            return;
        }
        GFG.a=new Node(0);
        GFG.b=new Node(0);
        
        Node a=GFG.a;
        Node b=GFG.b;
        Node current=head;
        a.next=current;
        while(current!=null && current.next!=null)
        {
            a.next=current;
            b.next=current.next;
            current=current.next.next;
            a=a.next;
            b=b.next;
        }
        if(current!=null)
        {
            a.next=current;
            a=a.next;
        }
        a.next=null;
        b.next=null;
        GFG.a=GFG.a.next;
        GFG.b=GFG.b.next;
    }
    
}