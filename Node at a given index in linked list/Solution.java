class GfG
{
   
    public static int getNth(Node node, int ind)
    {
        Node current=node;
        int count=1;
        while(count!=ind)
        {
            current=current.next;
            count+=1;
        }
        return current.data;
    }
}