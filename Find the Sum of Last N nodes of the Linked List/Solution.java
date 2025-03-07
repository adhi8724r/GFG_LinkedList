class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      int n=0;
      Node current=head;
      while(current!=null)
      {
          current=current.next;
          n++;
      }
      n=n-k;
      current=head;
      for(int i=1;i<=n;i++)
      {
          current=current.next;
      }
      int count=0;
      for(int i=1;i<=k;i++)
      {
          count+=current.data;
          current=current.next;
      }
      return count;
    }
}