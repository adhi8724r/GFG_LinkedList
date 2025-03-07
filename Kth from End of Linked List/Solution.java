class Solution
{
    int getNthFromLast(Node head, int n)
    {
     	int length=0;
    	Node current=head;
    	while(current!=null)
    	{
    	    current=current.next;
    	    length+=1;
    	}
    	if(n>length)
    	{
    	    return -1;
    	}
    	n=length-n+1;
    	current=head;
    	for(int i=1;i<n;i++)
    	{
    	    current=current.next;
    	}
    	return current.data;
    }
}