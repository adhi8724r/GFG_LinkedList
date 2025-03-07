class GfG
{
    public static int nknode(Node head, int k)
    {
       Node current=head;
       int n=0;
       while(current!=null)
       {
           n+=1;
           current=current.next;
       }
       n=(int)Math.ceil((double)n/k);
       current=head;
       for(int i=1;i<n;i++)
       {
           current=current.next;
       }
       return current.data;
    }
}