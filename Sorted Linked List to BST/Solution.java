class Solution {
    public TNode convertToBST(LNode head,LNode tail)
    {
        if(head==tail)
            return null;
        LNode slow=head;
        LNode fast=head;
        while(fast!=tail && fast.next!=tail)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        TNode root=new TNode(slow.data);
        root.left=convertToBST(head,slow);
        root.right=convertToBST(slow.next,tail);
        
        return root;
    }
    public TNode sortedListToBST(LNode head) {
        if(head==null)
            return null;
        return convertToBST(head,null);
    }
}