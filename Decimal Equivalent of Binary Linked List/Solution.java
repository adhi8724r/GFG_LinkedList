class Solution
{
   long DecimalValue(Node head)
   {
 	    long sum=0;
 	    Node current=head;
 	    while(current!=null)
 	    {
 	        sum=(2*sum+current.data)%1000000007;
 	        current=current.next;
 	    }
 	    return sum;
   }
}