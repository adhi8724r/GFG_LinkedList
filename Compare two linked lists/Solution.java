class GfG
{
    int compare(Node node1, Node node2)
    {
        while(node1!=null && node2!=null)
        {
            if(node1.data==node2.data)
            {
                node1=node1.next;
                node2=node2.next;
            }
            else if(node1.data>node2.data)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        if(node1==null && node2==null)
        {
            return 0;
        }
        if(node1!=null)
            return 1;
        else
            return -1;
    }
    
}